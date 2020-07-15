package ar.edu.unju.fi.UsuarioController;

import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;
import ar.edu.unju.fi.testeos.model.RegistroTesteo;
import ar.edu.unju.fi.tracking.services.IBarrioService;
import ar.edu.unju.fi.tracking.services.IRegistroTesteoService;
import ar.edu.unju.fi.tracking.services.IUnidadHabitacionalService;
@Controller
	public class RegistroTesteoController {

	@Autowired
	IRegistroTesteoService registroTesteoService;

	@Autowired
	RegistroTesteo registroTesteo;

	@Autowired
	IUnidadHabitacionalService unidadService;

	@Autowired
	IBarrioService barrioService;

	@GetMapping("/registroTesteoForm")
	public String cargarFormulario(Model model) {
	model.addAttribute("registroTesteo", registroTesteo);
	//model.addAttribute("listaUnidades", unidadService.listarunidadesHabitacionales());
	model.addAttribute("listaBarrios", barrioService.listarBarrios());
	model.addAttribute("listaRegistrosTesteo", registroTesteoService.listarregistroTesteos());
	model.addAttribute("formTab", "active");
	return "registroTesteo";
	}

	@PostMapping("/registroTesteoForm")
	public String crearRegistroTesteo(@Valid @ModelAttribute("registroTesteo") RegistroTesteo registroTesteo, BindingResult result,
	ModelMap model) {
	// agregado Valid (en el modelo tambien) y BindingResult
	if (result.hasErrors()) {
	// si da error el objeto recibido se vuelve a enviar a la vista
	model.addAttribute("registroTesteo", registroTesteo);
	model.addAttribute("formTab", "active");
	} else {
	try {
	registroTesteo.setFechaHora(LocalDateTime.now());
	List<PersonaTesteada> personas = new ArrayList<PersonaTesteada>();
	personas.add(new PersonaTesteada("38445151", "rrr", "aa", "negativos"));
	registroTesteo.setPersonasTesteadas(personas);
	registroTesteoService.guardar(registroTesteo);;
	model.addAttribute("registroTesteo", registroTesteo);
	model.addAttribute("listTab", "active");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	// pasar las excepciones al html
	model.addAttribute("formRegistroTesteoErrorMessage", e.getMessage());
	model.addAttribute("registroTesteo", registroTesteo);
	model.addAttribute("listaRegistrosTesteo", registroTesteoService.listarregistroTesteos());
	model.addAttribute("formTab", "active");
	}
	}
	model.addAttribute("listaRegistrosTesteo", registroTesteoService.listarregistroTesteos());
	return "registroTesteo";
	}

	@GetMapping("/cancelarRegistroTesteo")
	public String cancelarRegistroTesteo(ModelMap model) {
	return "redirect:/registroTesteo";
	}

	}

