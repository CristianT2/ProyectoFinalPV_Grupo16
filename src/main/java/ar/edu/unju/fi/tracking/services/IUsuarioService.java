package ar.edu.unju.fi.tracking.services;


import java.util.Optional;

import ar.edu.unju.fi.tracking.model.Usuario;


public interface IUsuarioService {
	public void guardar(Usuario usuario);
	public Usuario modificar(Usuario usuario) throws Exception;
	public Iterable<Usuario> listarUsuarios();
	public void eliminar(Long id);
	public Optional<Usuario>buscarUsuario(Long id);
	public Usuario encontrarUsuario(Long id) throws Exception;
	
}
