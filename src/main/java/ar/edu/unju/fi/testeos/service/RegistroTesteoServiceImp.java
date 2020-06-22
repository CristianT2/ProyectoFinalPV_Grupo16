package ar.edu.unju.fi.testeos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;
import ar.edu.unju.fi.testeos.repository.IRegistroTesteoDAO;

@Service
public class RegistroTesteoServiceImp implements IRegistroTesteoService {
	
	@Autowired
	private IRegistroTesteoDAO iregistrotesteo;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iregistrotesteo.guardar();
	}

	@Override
	public RegistroTesteo mostrar() {
		// TODO Auto-generated method stub
		RegistroTesteo registroTesteo=iregistrotesteo.mostrar();
		return registroTesteo;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iregistrotesteo.eliminar();
	}

	@Override
	public RegistroTesteo modificar() {
		// TODO Auto-generated method stub
		RegistroTesteo registroTesteo=iregistrotesteo.modificar();
		return registroTesteo;
	}

}
