package ar.edu.unju.fi.testeos.service;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;

public interface IPersonaTesteadaService {
	
	public void guardar();
	public PersonaTesteada mostrar();
	public void eliminar();
	public PersonaTesteada modificar();
	
	
}
