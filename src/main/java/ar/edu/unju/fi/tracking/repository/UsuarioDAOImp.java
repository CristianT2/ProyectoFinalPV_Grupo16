package ar.edu.unju.fi.tracking.repository;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;
import org.slf4j.LoggerFactory;
import ar.edu.unju.fi.ProyectoFinalPvGrupo16Application;
import ar.edu.unju.fi.tracking.model.Usuario;

@Repository("usuarioDAOImp")
public class UsuarioDAOImp implements IUsuarioDAO {
	
	public static Logger LOG= LoggerFactory.getLogger(ProyectoFinalPvGrupo16Application.class);

	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
