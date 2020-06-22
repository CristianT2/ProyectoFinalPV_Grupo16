package ar.edu.unju.fi.tracking.service;

import ar.edu.unju.fi.tracking.model.Usuario;

public interface IUsuarioService {

	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}
