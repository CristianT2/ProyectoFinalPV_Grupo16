package ar.edu.unju.fi.tracking.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.repository.IUsuarioDAO;
@Service
public class IUsuarioServiceImp implements IUsuarioService{
	@Autowired
	IUsuarioDAO usuarioDao;

	@Override
	public void guardar(Usuario usuario) {
	usuarioDao.save(usuario);
	System.out.println(usuario.getApellidoReal());
	System.out.println("Se registro el usuario correcto!!!!");
	}

	@Override
	public Optional<Usuario> buscarUsuario(Long id) {
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public Iterable<Usuario> listarUsuarios() {
	return usuarioDao.findAll();
	}

	@Override
	public void eliminar(Long id) {
	usuarioDao.deleteById(id);

	}

	@Override
	public Usuario encontrarUsuario(Long id) throws Exception {
	return usuarioDao.findById(id).orElseThrow(()-> new Exception("El Usuario no existe"));
	}

	@Override
	public Usuario modificar(Usuario usuario)throws Exception {
	Usuario usuarioGuardar = encontrarUsuario(usuario.getId());
	mapearUsuario(usuario, usuarioGuardar);
	return usuarioDao.save(usuarioGuardar);
	}
	public void mapearUsuario(Usuario desde, Usuario hacia) {
		hacia.setApellidoReal(desde.getApellidoReal());
		hacia.setNombreReal(desde.getNombreReal());
		hacia.setNombreUsuario(desde.getNombreUsuario());
		hacia.setPassword(desde.getPassword());
		hacia.setTipoUsuario(desde.getTipoUsuario());
		}
}
