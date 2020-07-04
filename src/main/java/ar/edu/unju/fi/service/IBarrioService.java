package ar.edu.unju.fi.service;

import java.util.Optional;

import ar.edu.unju.fi.trackpersonas.model.Barrio;

public interface IBarrioService {

	public void guardarBarrio(Barrio unBarrio);
	public void eliminarBarrio(Long id);
	public Iterable<Barrio> listarBarrios();
	public Optional<Barrio>obtenerUnBarrio(Long id);
}
