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

import ar.edu.unju.fi.service.IRegistroTesteoService;
import ar.edu.unju.fi.testeos.model.RegistroTesteo;

@Controller
@RequestMapping("/RegistroTest")
public class RegistroTesteoController {

	@Autowired
	IRegistroTesteoService registroService;
	
	@Autowired
	private RegistroTesteo registroTesteo;
	
	@RequestMapping("/")
	public String listarRegistros(Model model) {
		Iterable<RegistroTesteo> registros= registroService.ListarRegistros();
		model.addAttribute("registros", registros);
		return "listaPersRegistradas";
	}
	
	@GetMapping("/registrarPersona")
	public String registrarPersona(Model model) {
		model.addAttribute("registro", registroTesteo);
		return"registroPersTesteadas";
	}
	
	@PostMapping("/guardar")
	public String guardarRegistro(@Validated RegistroTesteo registroTesteo, Model model ) {
		registroService.guardarRegistro(registroTesteo);
		return "redirect:/listaRegistros";
	}
	
	@GetMapping("/editar/{id}")
	public String modificarRegistro(@PathVariable Long id,Model model) {
		Optional<RegistroTesteo> registro= registroService.obtenerUnRegistro(id);
		model.addAttribute("registro", registro);
		return "/registroPersTesteadas";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarRegistro(@PathVariable Long id, Model model) {
		registroService.eliminarRegistro(id);
		return"redirect:/listaPersRegistradas";
	}
	
}
