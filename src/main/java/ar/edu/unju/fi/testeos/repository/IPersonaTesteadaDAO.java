package ar.edu.unju.fi.testeos.repository;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;

public interface IPersonaTesteadaDAO {

	public void guardar();
	public PersonaTesteada mostrar();
	public void eliminar();
	public PersonaTesteada modificar();
}
