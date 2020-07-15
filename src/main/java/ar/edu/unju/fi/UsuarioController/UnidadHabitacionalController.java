package ar.edu.unju.fi.UsuarioController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;
import ar.edu.unju.fi.tracking.services.IBarrioService;
import ar.edu.unju.fi.tracking.services.IUnidadHabitacionalService;
import ar.edu.unju.fi.trackpersonas.model.Barrio;

@Controller
public class UnidadHabitacionalController {

	@Autowired
	IUnidadHabitacionalService unidadService;

	@Autowired
	UnidadHabitacional unidadHabitacional;

	@Autowired
	Barrio barrio;

	@Autowired
	IBarrioService barrioService;

	@GetMapping("/unidadForm")
	public String cargarFormulario(Model model) {
		model.addAttribute("unidadHabitacional", new UnidadHabitacional());
		model.addAttribute("listaBarrios", barrioService.listarBarrios());
		model.addAttribute("listaUnidadHabitacional", unidadService.listarunidadHabitacionales());
		model.addAttribute("unidadTab", "active");
		return "unidadHabitacional";
	}

	@PostMapping("/unidadForm")
	public String crearUnidadHabitacional(
			@Valid @ModelAttribute("unidadHabitacional") UnidadHabitacional unidadHabitacional, BindingResult result,
			ModelMap model) {
		// agregado Valid (en el modelo tambien) y BindingResult
		if (result.hasErrors()) {
			// si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("unidadHabitacional", unidadHabitacional);
			model.addAttribute("unidadTab", "active");
		} else {
			try {

				unidadService.guardar(unidadHabitacional);
				model.addAttribute("unidadHabitacional", unidadHabitacional);
				model.addAttribute("listUnidadTab", "active");
			} catch (Exception e) {

				// pasar las excepciones al html
				model.addAttribute("formUnidadHabitacionalErrorMessage", e.getMessage());
				model.addAttribute("unidadHabitacional", unidadHabitacional);
				model.addAttribute("listaUnidadHabitacional", unidadService.listarunidadHabitacionales());
				model.addAttribute("unidadTab", "active");
			}
		}
		model.addAttribute("listaUnidadHabitacional", unidadService.listarunidadHabitacionales());
		return "unidadHabitacional";
	}

	@GetMapping("/cancelarUnidadHabitacional")
	public String cancelarUnidadHabitacional(ModelMap model) {
		return "redirect:/unidadHabitacional";
	}

}
