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

import ar.edu.unju.fi.service.IBarrioService;
import ar.edu.unju.fi.trackpersonas.model.Barrio;

@Controller
@RequestMapping("/barrios")
public class BarrioController {

	@Autowired
	IBarrioService barrioService;
	
	@Autowired
	private Barrio barrio;
	
	@RequestMapping("/barrios")
	public String mostrarBarrios(Model model) {
		Iterable<Barrio> barrios= barrioService.listarBarrios();
		model.addAttribute("barrios", barrios);
		return "/listaBarrios";
	}
	
	@GetMapping("/agregarBarrio")
	public String crearBarrio(Model model) {
		model.addAttribute("barrio", barrio);
		return "/barrioForm";
	}
	
	@PostMapping("/guardar")
	public String guardarBarrio(@Validated Barrio barrio, Model model) {
		barrioService.guardarBarrio(barrio);
		return "redirect:/barrios";
	}
	
	@GetMapping("/editar/{id}")
	public String editarBarrio(@PathVariable Long id ,Model model) {
		Optional<Barrio>barrio= barrioService.obtenerUnBarrio(id);
		model.addAttribute("barrio",barrio);
		return"/barrioForm";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarBarrio(@PathVariable Long id, Model model) {
		barrioService.eliminarBarrio(id);
		return"redirect:/barrios";
	}
	
}
