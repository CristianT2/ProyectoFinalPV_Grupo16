package ar.edu.unju.fi.UsuarioController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;

import ar.edu.unju.fi.tracking.services.IPersonaTesteadaServiceImp;

@Controller
public class PersonaTesteadaController {
	@Autowired
	private IPersonaTesteadaServiceImp personaTesteadaService;

	@Autowired
	private PersonaTesteada personaTesteada;

	@GetMapping("/personaTesteadaForm")
	public String getFormPersona( Model modelo) {

	modelo.addAttribute("personaTesteada", new PersonaTesteada());
	modelo.addAttribute("activo", false);
	return "persona";
	}


	@PostMapping("/buscarPersona")
	public String buscarPersonaTesteada (@Valid @ModelAttribute("personaTesteada") PersonaTesteada persona,
	Model modelo) {
	modelo.addAttribute("personaTesteada", persona);
	PersonaTesteada personaEncontrada= new PersonaTesteada();


	if(persona.getDocumento().isEmpty() == false) {
	try {
	personaEncontrada = personaTesteadaService.byFindDniPersonaTesteada(persona.getDocumento());
	System.out.println(personaEncontrada.toString());
	} catch (Exception e) {

	modelo.addAttribute("activo", false);
	modelo.addAttribute("error", "dni no existe");

	return "persona";
	}
	modelo.addAttribute("persona", personaEncontrada);
	modelo.addAttribute("activo", true);
	}
	else {
	modelo.addAttribute("activo", false);
	modelo.addAttribute("error", "Ingrese documento");
	}
	return "persona";
	}
}

