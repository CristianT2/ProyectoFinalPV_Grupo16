package ar.edu.unju.fi.UsuarioController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {
	@RequestMapping("/home")
	public String getUsuarioForm(Model model) {
		return "home";
	}
	
	@RequestMapping("/login")
	public String getLogin(Model model) {
		return "login";
	}
	
	@RequestMapping("/formulario")
	public String getForm(Model model) {
		return "formulario";
	}
}
