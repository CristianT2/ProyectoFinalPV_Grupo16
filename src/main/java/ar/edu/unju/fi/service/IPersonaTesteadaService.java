package ar.edu.unju.fi.service;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;

public interface IPersonaTesteadaService {
	
	public void crear(PersonaTesteada unaPersona);
	public PersonaTesteada modificar(PersonaTesteada unaPersona) throws Exception;
	public void eliminar(Long id);
	public Iterable<PersonaTesteada> listarPersonas();
	public PersonaTesteada buscarPersona(Long id) throws Exception;
 	
}
