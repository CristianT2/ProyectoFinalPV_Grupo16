package ar.edu.unju.fi.service;

import java.util.Optional;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;

public interface IRegistroTesteoService {
	
	public void guardarRegistro(RegistroTesteo unRegistro);
	public void eliminarRegistro(Long id);
	public Iterable<RegistroTesteo> ListarRegistros();
	public Optional<RegistroTesteo>obtenerUnRegistro(Long id);
	
}
