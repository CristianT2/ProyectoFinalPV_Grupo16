package ar.edu.unju.fi.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tracking.model.Usuario;
import ar.edu.unju.fi.tracking.repository.IUsuarioDAO;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	private IUsuarioDAO iusuariodao;
	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iusuariodao.guardar();
	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		Usuario usuario=iusuariodao.mostrar();
		return usuario;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iusuariodao.elimninar();
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		Usuario usuario=iusuariodao.modificar();
		return usuario;
	}

}
