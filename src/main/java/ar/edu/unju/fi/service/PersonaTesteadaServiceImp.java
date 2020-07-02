package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.repository.IPersonaTesteadaRepository;
import ar.edu.unju.fi.testeos.model.PersonaTesteada;

@Service
public class PersonaTesteadaServiceImp implements IPersonaTesteadaService {

	@Autowired
	IPersonaTesteadaRepository ipersonaTest;
	
	@Override
	public void crear(PersonaTesteada unaPersona) {
		// TODO Auto-generated method stub
		ipersonaTest.save(unaPersona);
	}

	@Override
	public PersonaTesteada modificar(PersonaTesteada unaPersona) throws Exception {
		// TODO Auto-generated method stub
		return ipersonaTest.save(unaPersona);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		ipersonaTest.deleteById(id);
	}

	@Override
	public Iterable<PersonaTesteada> listarPersonas() {
		// TODO Auto-generated method stub
		return ipersonaTest.findAll();
	}

	@Override
	public PersonaTesteada buscarPersona(Long id) throws Exception {
		// TODO Auto-generated method stub
		return ipersonaTest.findById(id).orElseThrow(()-> new Exception("La Persona No Se Encuentra Registrada"));
	}

}
