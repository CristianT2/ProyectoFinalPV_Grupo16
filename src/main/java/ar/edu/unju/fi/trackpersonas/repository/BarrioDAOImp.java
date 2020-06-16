package ar.edu.unju.fi.trackpersonas.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.ProyectoFinalPvGrupo16Application;
import ar.edu.unju.fi.trackpersonas.model.Barrio;

@Repository("barrioDAOImp")
public class BarrioDAOImp implements IBarrioDAO {

	public static Logger LOG = LoggerFactory.getLogger(ProyectoFinalPvGrupo16Application.class);

	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Barrio mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Barrio modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
