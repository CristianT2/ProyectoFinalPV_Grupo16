package ar.edu.unju.fi.testeos.repository;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;

public interface IUnidadHabitacionalDAO {
	
	public void guardar();
	public UnidadHabitacional mostrar();
	public void eliminar();
	public UnidadHabitacional modificar();
	

}
