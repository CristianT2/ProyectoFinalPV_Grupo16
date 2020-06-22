package ar.edu.unju.fi.trackpersonas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.trackpersonas.model.Barrio;
import ar.edu.unju.fi.trackpersonas.repository.IBarrioDAO;

@Service
public class BarrioServiceImp implements IBarrioService {

	@Autowired
	private IBarrioDAO ibarriodao;
	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		ibarriodao.guardar();
	}

	@Override
	public Barrio mostrar() {
		// TODO Auto-generated method stub
		Barrio barrio=ibarriodao.mostrar();
		return barrio;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		ibarriodao.eliminar();
	}

	@Override
	public Barrio modificar() {
		// TODO Auto-generated method stub
		Barrio barrio=ibarriodao.modificar();
		return barrio;
	}

}
