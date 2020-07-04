package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;
import ar.edu.unju.fi.testeos.repository.IPersonaTesteadaDAO;

@Service
public class IPersonaTesteadaServiceImp implements IPersonaTesteadaService {

	@Autowired
	@Qualifier("personaTesteadaDaoImp")
	private IPersonaTesteadaDAO personaTesteadaDaoImp;

	@Override
	public void crear(PersonaTesteada personaTesteada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonaTesteada modificar() {
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
	public Optional<PersonaTesteada> encontrarPersonaTesteada(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(PersonaTesteada personaTesteada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonaTesteada modificar(PersonaTesteada personaTesteada) {
		// TODO Auto-generated method stub
		return null;
	}
}