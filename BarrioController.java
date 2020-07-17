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

import ar.edu.unju.fi.tracking.services.IBarrioServiceImp;

import ar.edu.unju.fi.trackpersonas.model.Barrio;

@Controller

public class BarrioController {

	@Autowired
	private IBarrioServiceImp barrioService;

	@Autowired
	private Barrio barrio;

	@GetMapping("/barrioForm")
	public String cargarFormulario(Model model) {
		model.addAttribute("barrio", barrio);
		model.addAttribute("listaBarrios", barrioService.listarBarrios());
		model.addAttribute("formTab", "active");
		return "barrio";
	}

	@PostMapping("/barrioForm")
	public String crearBarrio(@Valid @ModelAttribute("barrio") Barrio barrio, BindingResult result, ModelMap model) {
		// agregado Valid (en el modelo tambien) y BindingResult
		if (result.hasErrors()) {
			// si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("barrio", barrio);
			model.addAttribute("formTab", "active");
		} else {
			try {
				barrioService.guardar(barrio);
				model.addAttribute("barrio", barrio);
				model.addAttribute("listTab", "active");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// pasar las excepciones al html
				model.addAttribute("formBarrioErrorMessage", e.getMessage());
				model.addAttribute("barrio", barrio);
				model.addAttribute("listaBarrios", barrioService.listarBarrios());
				model.addAttribute("formTab", "active");
			}
		}
		model.addAttribute("listaBarrios", barrioService.listarBarrios());
		return "barrio";
	}

	@GetMapping("/cancelarBarrio")
	public String cancelarEditarBarrio(ModelMap model) {
		return "redirect:/barrioForm";
	}

	@GetMapping("/eliminarBarrio/{id}")
	public String eliminarBarrio(Model model, @PathVariable(name = "id") Long id) {
		try {
			barrioService.eliminar(id);
		} catch (Exception e) {
			model.addAttribute("listErrorMessage", e.getMessage());
		}
		return "redirect:/barrioForm";
	}

	@GetMapping("/editarBarrio/{id}")
	public String editar(@PathVariable(name = "id") Long id, Model model) throws Exception {
		try {
			Barrio barrioEncontrado = barrioService.encontrarBarrio(id);
			model.addAttribute("barrio", barrioEncontrado);

			model.addAttribute("listaBarrios", barrioService.listarBarrios());
		} catch (Exception e) {
			model.addAttribute("formBarrioErrorMessage", e.getMessage());

			model.addAttribute("barrioForm", new Barrio());
		}

		model.addAttribute("formTab", "active");
		model.addAttribute("editMode", "true");
		model.addAttribute("listaBarrios", barrioService.listarBarrios());
		return "barrio";
	}

	@PostMapping("/editarBarrio")
	public String postEditarBarrio(@Valid @ModelAttribute("barrio") Barrio barrio, ModelMap model,
			BindingResult result) {
		if (result.hasErrors()) {
			// si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("barrio", barrio);

		}
		try {
			barrioService.modificar(barrio);
			model.addAttribute("barrioForm", new Barrio());
			model.addAttribute("barrio", barrio);
			model.addAttribute("listTab", "active");
			model.addAttribute("editMode", "false");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// pasar las excepciones al html
			model.addAttribute("formBarrioErrorMessage", e.getMessage());
			model.addAttribute("barrio", barrio);
			model.addAttribute("formTab", "active");

			model.addAttribute("editMode", "true");
			model.addAttribute("barrio", barrio);

		}
		model.addAttribute("listaBarrios", barrioService.listarBarrios());
		return "barrio";
	}

}
