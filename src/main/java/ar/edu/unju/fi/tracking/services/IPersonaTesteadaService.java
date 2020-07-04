package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;


public interface IPersonaTesteadaService {

	public void crear(PersonaTesteada personaTesteada);
	public PersonaTesteada modificar();
	public void eliminar();
	public List listar();
	public Optional<PersonaTesteada> encontrarPersonaTesteada(Long id);
	void guardar(PersonaTesteada personaTesteada);
	PersonaTesteada modificar(PersonaTesteada personaTesteada);
}