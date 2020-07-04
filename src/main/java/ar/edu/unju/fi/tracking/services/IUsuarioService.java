package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import ar.edu.unju.fi.tracking.model.Usuario;

public interface IUsuarioService {
	public void crear(Usuario usuario);
	public Usuario modificar();
	public void eliminar();
	public List listar();
	public Optional<Usuario> encontrarUsuario(Long id);
	void guardar(Usuario usuario);
	Usuario modificar(Usuario usuario);
}
