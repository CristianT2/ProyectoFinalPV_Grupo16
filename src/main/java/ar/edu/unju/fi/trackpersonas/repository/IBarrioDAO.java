package ar.edu.unju.fi.trackpersonas.repository;

import ar.edu.unju.fi.trackpersonas.model.Barrio;

public interface IBarrioDAO {

	public void guardar();
	public Barrio mostrar();
	public void eliminar();
	public Barrio modificar();
	
}
