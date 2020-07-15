package ar.edu.unju.fi.UsuarioController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import ar.edu.unju.fi.tracking.model.Usuario;

import ar.edu.unju.fi.tracking.services.IUsuarioServiceImp;

@Controller

public class UsuarioController {
	@Autowired
	private IUsuarioServiceImp usuarioService;

	@Autowired
	private Usuario usuario;


	@GetMapping("/usuarioForm")
	public String cargarFormulario(Model model) {
	model.addAttribute("usuario", usuario);
	model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
	model.addAttribute("formTab", "active");
	return "usuarios";
	}

	@PostMapping("/usuarioForm")
	public String crearUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result,
	ModelMap model) {
	// agregado Valid (en el modelo tambien) y BindingResult
	if (result.hasErrors()) {
	// si da error el objeto recibido se vuelve a enviar a la vista
	model.addAttribute("usuario", usuario);
	model.addAttribute("formTab", "active");
	} else {
	try {
	usuarioService.guardar(usuario);
	model.addAttribute("usuario", usuario);
	model.addAttribute("listTab", "active");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	// pasar las excepciones al html
	model.addAttribute("formUsuarioErrorMessage", e.getMessage());
	model.addAttribute("usuario", usuario);
	model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
	model.addAttribute("formTab", "active");
	}
	}
	model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
	return "usuarios";
	}
	@GetMapping("/cancelarUsuario")
	public String cancelarEditarUsuario(ModelMap model) {
	return "redirect:/usuarioForm";
	}

	@GetMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(Model model, @PathVariable(name="id") Long id) {
	try {
	usuarioService.eliminar(id);;
	}
	catch(Exception e){
	model.addAttribute("listErrorMessage",e.getMessage());
	}
	return "redirect:/usuarioForm";
	}


	@GetMapping("/editarUsuario/{id}")
	public String obtenerFormularioEditarUsuario(Model model, @PathVariable(name="id") Long id) throws Exception {
	try {
	Usuario usuarioEncontrado = usuarioService.encontrarUsuario(id);
	model.addAttribute("usuario", usuarioEncontrado);
	model.addAttribute("editMode", "true");
	}
	catch (Exception e) {
	model.addAttribute("formUsuarioErrorMessage",e.getMessage());
	model.addAttribute("usuario", usuario);
	model.addAttribute("editMode", "false");
	}
	model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
	model.addAttribute("formTab", "active");
	return "usuarios";
	}

	@PostMapping("/editarUsuario")
	public String postEditarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, ModelMap model) {
	if(result.hasErrors()) {
	//si da error el objeto recibido se vuelve a enviar a la vista
	model.addAttribute("usuario", usuario);
	model.addAttribute("formTab", "active");
	model.addAttribute("editMode", "true");
	} else {
	try {
	usuarioService.modificar(usuario);
	model.addAttribute("usuario", usuario);
	model.addAttribute("listTab", "active");
	model.addAttribute("editMode", "false");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	// pasar las excepciones al html
	model.addAttribute("formUsuarioErrorMessage",e.getMessage());
	model.addAttribute("usuario", usuario);
	model.addAttribute("formTab", "active");
	model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
	model.addAttribute("editMode", "true");
	}
	}
	model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
	return "usuarioForm";
	}
}

