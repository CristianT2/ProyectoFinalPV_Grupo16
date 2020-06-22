package ar.edu.unju.fi.trackpersonas.service;

import ar.edu.unju.fi.trackpersonas.model.Barrio;

public interface IBarrioService {

	public void guardar();
	public Barrio mostrar();
	public void eliminar();
	public Barrio modificar();
}
