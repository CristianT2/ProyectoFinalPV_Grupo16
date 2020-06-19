package ar.edu.unju.fi.testeos.repository;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;

public interface IRegistroTesteoDAO {

	public void guardar();
	public RegistroTesteo mostrar();
	public void eliminar();
	public RegistroTesteo modificar();
}
