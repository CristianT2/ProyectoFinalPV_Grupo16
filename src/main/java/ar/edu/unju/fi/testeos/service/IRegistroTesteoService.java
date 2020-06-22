package ar.edu.unju.fi.testeos.service;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;

public interface IRegistroTesteoService {
	
	public void guardar();
	public RegistroTesteo mostrar();
	public void eliminar();
	public RegistroTesteo modificar();

}
