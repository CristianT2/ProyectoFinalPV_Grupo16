package ar.edu.unju.fi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;
import ar.edu.unju.fi.tracking.model.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	private Usuario usuario;
	
	@RequestMapping("/usuarios")
	public String mostrarUsuarios(Model model) {
		Iterable<Usuario>usuarios= usuarioService.listarUsuarios();
		model.addAttribute("usuarios", usuarios);
		return"/listaUsuarios";
	}
	
	@GetMapping("/nuevoUsuario")
	public String crarUsuario(Model model) {
		model.addAttribute("usuario", usuario);
		return"/registroUser";
	}

	@PostMapping("/guardar")
	public String guardarUsuario(@Validated Usuario usuario, Model model) {
		usuarioService.crearUsuario(usuario);
		return "redirect:/listaUsuarios";	
	} 
	
	@GetMapping("/editar")
	public String editarUsuario(@PathVariable Long id, Model model) {
		Optional<Usuario> usuario= usuarioService.obtenerUnUsuario(id);
		model.addAttribute("usuario", usuario);
		return"/registroUser";
	}
	
	@GetMapping("/eliminar")
	public String eliminarUsuario(@PathVariable Long id, Model model) {
		usuarioService.eliminarUsuario(id);
		return"redirect:/listaUsuarios";
	}
}
