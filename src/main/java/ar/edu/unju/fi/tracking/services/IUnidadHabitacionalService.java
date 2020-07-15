package ar.edu.unju.fi.tracking.services;


import java.util.Optional;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;





public interface IUnidadHabitacionalService {
	public void guardar(UnidadHabitacional unidadHabitacional);
	public UnidadHabitacional modificar(UnidadHabitacional unidadHabitacional) throws Exception;
	public Iterable<UnidadHabitacional> listarunidadHabitacionales();
	public void eliminar(Long id);
	public Optional<UnidadHabitacional>buscarUnidadHabitacional(Long id);
	public UnidadHabitacional encontrarUnidadHabitacional(Long id) throws Exception;
	
}


