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

import ar.edu.unju.fi.testeos.model.PersonaTesteada;

import ar.edu.unju.fi.tracking.services.IPersonaTesteadaServiceImp;

@Controller
public class PersonaTesteadaController {
	@Autowired
	private IPersonaTesteadaServiceImp personaTesteadaService;

	@Autowired
	private PersonaTesteada personaTesteada;


	@GetMapping("personaTesteada/Form")
	public String cargarFormulario(Model model) {
	model.addAttribute("personaTesteada", personaTesteada);
	model.addAttribute("listaPersonaTesteadas", personaTesteadaService.listarpersonaTesteadas());
	model.addAttribute("formTab", "active");
	return "personaTesteadas";
	}

	@PostMapping("/personaTesteadaForm")
	public String crearPersonaTesteada(@Valid @ModelAttribute("personaTesteada") PersonaTesteada personaTesteada, BindingResult result,
	ModelMap model) {
	// agregado Valid (en el modelo tambien) y BindingResult
	if (result.hasErrors()) {
	// si da error el objeto recibido se vuelve a enviar a la vista
	model.addAttribute("personaTesteada", personaTesteada);
	model.addAttribute("formTab", "active");
	} else {
	try {
		personaTesteadaService.guardar(personaTesteada);
	model.addAttribute("personaTesteada", personaTesteada);
	model.addAttribute("listTab", "active");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	// pasar las excepciones al html
	model.addAttribute("formBarrioErrorMessage", e.getMessage());
	model.addAttribute("personaTesteada" , personaTesteada);
	model.addAttribute("listaPersonaTesteadas", personaTesteadaService.listarpersonaTesteadas());
	model.addAttribute("formTab", "active");
	}
	}
	model.addAttribute("listaPersonaTesteadas", personaTesteadaService.listarpersonaTesteadas());
	return "personasTesteadas";
	}
	@GetMapping("/cancelar")
	public String cancelarEditarPersonaTesteada(ModelMap model) {
	return "redirect:/personaTesteadaForm";
	}

	@GetMapping("/eliminarPersonaTesteada/{id}")
	public String eliminarPersonaTesteada(Model model, @PathVariable(name="id") Long id) {
	try {
	personaTesteadaService.eliminar(id);;
	}
	catch(Exception e){
	model.addAttribute("listErrorMessage",e.getMessage());
	}
	return cargarFormulario(model);
	}


	@GetMapping("/editarPersonaTesteada/{id}")
	public String obtenerFormularioEditarPersonaTesteada(Model model, @PathVariable(name="id") Long id) throws Exception {
	try {
	PersonaTesteada personaTesteadaEncontrado = personaTesteadaService.encontrarPersonaTesteada(id);
	model.addAttribute("personaTesteada", personaTesteadaEncontrado);
	model.addAttribute("editMode", "true");
	}
	catch (Exception e) {
	model.addAttribute("formPersonaTesteadaErrorMessage",e.getMessage());
	model.addAttribute("personaTesteada", personaTesteada);
	model.addAttribute("editMode", "false");
	}
	model.addAttribute("listaPersonaTesteadas", personaTesteadaService.listarpersonaTesteadas());
	model.addAttribute("formTab", "active");
	return "personaTesteadas";
	}

	@PostMapping("/editarPersonatesteada")
	public String postEditarPersonaTesteada(@Valid @ModelAttribute("personaTesteada") PersonaTesteada personaTesteada, BindingResult result, ModelMap model) {
	if(result.hasErrors()) {
	//si da error el objeto recibido se vuelve a enviar a la vista
	model.addAttribute("personaTesteada", personaTesteada);
	model.addAttribute("formTab", "active");
	model.addAttribute("editMode", "true");
	} else {
		try {
			personaTesteadaService.modificar(personaTesteada);
	model.addAttribute("personaTesteada", personaTesteada);
	model.addAttribute("listTab", "active");
	model.addAttribute("editMode", "false");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	// pasar las excepciones al html
	model.addAttribute("forPersonaTesteadaErrorMessage",e.getMessage());
	model.addAttribute("personaTesteada", personaTesteada);
	model.addAttribute("formTab", "active");
	model.addAttribute("listaPersonaTesteadas", personaTesteadaService.listarpersonaTesteadas());
	model.addAttribute("editMode", "true");
	}
	}
	model.addAttribute("listaPersonaTesteadas", personaTesteadaService.listarpersonaTesteadas());
	return "barrioForm";
	}
}

