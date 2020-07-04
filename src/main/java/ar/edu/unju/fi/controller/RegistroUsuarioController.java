package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;
import ar.edu.unju.fi.tracking.model.Usuario;

@Controller
@RequestMapping("/")
public class RegistroUsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private Usuario usuario;

	@GetMapping
	public String mostrarFormularioRegistro() {
		return "/inicioSecion";
	}
	
	@PostMapping("/registrarse")
	public String registrarUsuario(Model model) {
		model.addAttribute("usuario", usuario);
		return "/registroUser";
	}
	
	

}
