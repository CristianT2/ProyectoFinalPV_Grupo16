package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.repository.IUsuarioDAO;
@Service
public class IUsuarioServiceImp implements IUsuarioService{
	@Autowired
	@Qualifier("usuarioDaoImp")
	private IUsuarioDAO usuarioDaoImp;

	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDaoImp.save(usuario);
	}

	@Override
	public Usuario modificar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

	
	public void eliminar(Usuario usuario) {
}

	@Override
	public void crear(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> encontrarUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}