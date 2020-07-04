package ar.edu.unju.fi.UsuarioController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.services.IUsuarioService;

@Controller
@RequestMapping
public class UsuarioController {

	@Autowired
	IUsuarioService usuarioService;

	@Autowired
	Usuario usuario;

	@RequestMapping("/formulario")
	public String getForm(Model model) {
	return "formulario";
	}

	@RequestMapping("/listadoUsuarios")
	public String getListUsuarios(Model model) {
	return "listadoUsuarios";
	}

	@GetMapping("/usuarios")
	public String getUsuarioForm(Model model) {
	model.addAttribute("usuario",new Usuario());
	return "usuarios";
	}

	@PostMapping("/usuarios")
	public String guardar( @ModelAttribute("usuario")Usuario usuario, Model model) {

	model.addAttribute("usuario", new Usuario());
	//model.addAttribute("listTab", "active");
	usuarioService.guardar(usuario);
	return "usuarios";

	}
}