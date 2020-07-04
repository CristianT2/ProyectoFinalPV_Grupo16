package ar.edu.unju.fi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.repository.IUsuarioRepository;
import ar.edu.unju.fi.tracking.model.Usuario;

@Service
public class UsuarioServiceImp implements IUsuarioService {
	
	@Autowired
	IUsuarioRepository usuarioRepository;

	/**
	 * Metodo que permite crear un usuario
	 *
	 */
	@Override
	public void crearUsuario(Usuario unUsuario) {
		// TODO Auto-generated method stub
		usuarioRepository.save(unUsuario);
	}

	/**
	 * Metodo para eliminar un usuario
	 *
	 */
	@Override
	public void eliminarUsuario(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	/**
	 * Metodo para mostrar los usuarios
	 *
	 */
	@Override
	public Iterable<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}
	
	/**
	 * Metodo para modificar un usuario
	 *
	 */
	@Override
	public Optional<Usuario> obtenerUnUsuario(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
