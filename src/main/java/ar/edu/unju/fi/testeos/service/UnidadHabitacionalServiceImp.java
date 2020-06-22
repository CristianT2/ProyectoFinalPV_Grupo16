package ar.edu.unju.fi.testeos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;
import ar.edu.unju.fi.testeos.repository.IUnidadHabitacionalDAO;

@Service
public class UnidadHabitacionalServiceImp implements IUnidadHabitacionalService {
	
	@Autowired
	private IUnidadHabitacionalDAO iunidadhabitacional;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iunidadhabitacional.guardar();
	}

	@Override
	public UnidadHabitacional mostrar() {
		// TODO Auto-generated method stub
		UnidadHabitacional unidadHabitacional= iunidadhabitacional.mostrar();
		return unidadHabitacional;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iunidadhabitacional.eliminar();
	}

	@Override
	public UnidadHabitacional modificar() {
		// TODO Auto-generated method stub
		UnidadHabitacional unidadHabitacional= iunidadhabitacional.modificar();
		return unidadHabitacional;
	}

}
