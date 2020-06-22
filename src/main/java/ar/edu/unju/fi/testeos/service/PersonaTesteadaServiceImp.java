package ar.edu.unju.fi.testeos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;
import ar.edu.unju.fi.testeos.repository.IPersonaTesteadaDAO;

@Service
public class PersonaTesteadaServiceImp implements IPersonaTesteadaService {
	
	@Autowired
	private IPersonaTesteadaDAO ipersonatesteada;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		ipersonatesteada.guardar();
	}

	@Override
	public PersonaTesteada mostrar() {
		// TODO Auto-generated method stub
		PersonaTesteada personaTesteada= ipersonatesteada.mostrar();
		return personaTesteada;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		ipersonatesteada.eliminar();

	}

	@Override
	public PersonaTesteada modificar() {
		// TODO Auto-generated method stub
		PersonaTesteada personaTesteada=ipersonatesteada.modificar();
		return personaTesteada;
	}

}
