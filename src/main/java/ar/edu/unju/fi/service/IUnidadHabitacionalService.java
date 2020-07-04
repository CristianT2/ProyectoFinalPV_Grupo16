package ar.edu.unju.fi.service;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;

public interface IUnidadHabitacionalService {

	public void crearUnidadHab(UnidadHabitacional unaUnidHab);
	public void eliminarUnidadHab(Long id);
	public UnidadHabitacional modificar(UnidadHabitacional unaUnidHab) throws Exception;
	public Iterable<UnidadHabitacional>listarUnidadHab();
}
