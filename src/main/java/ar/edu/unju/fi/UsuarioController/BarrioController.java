package ar.edu.unju.fi.UsuarioController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.trackpersonas.model.Barrio;

@Controller
@RequestMapping
public class BarrioController {

@Autowired
Barrio barrio;

@RequestMapping("/barrio")
public String getForm(Model model) {
return "barrio";
}

@GetMapping("/barrio")
public String getUsuarioForm(Model model) {
model.addAttribute("barrio",new Barrio());
return "barrio";
}

@PostMapping("/barrio")
public String guardar( @ModelAttribute("barrio")Barrio barrio, Model model) {

//model.addAttribute("usuario", new Usuario());
//model.addAttribute("listTab", "active");
//usuarioService.guardar(usuario);
return "barrio";

}
}