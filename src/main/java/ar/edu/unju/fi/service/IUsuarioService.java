package ar.edu.unju.fi.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import ar.edu.unju.fi.tracking.model.Usuario;

public interface IUsuarioService extends UserDetailsService {

	public void crearUsuario(Usuario unUsuario);
	public void eliminarUsuario(Long id);
	public Iterable<Usuario> listarUsuarios();
	public Optional<Usuario>obtenerUnUsuario(Long id);
	
}
