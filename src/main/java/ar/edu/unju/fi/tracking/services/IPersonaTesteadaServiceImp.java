package ar.edu.unju.fi.tracking.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;
import ar.edu.unju.fi.testeos.repository.IPersonaTesteadaDAO;



@Service
public class IPersonaTesteadaServiceImp implements IPersonaTesteadaService {

	@Autowired
     IPersonaTesteadaDAO personaTesteadaDao;
	

	@Override
	public void guardar(PersonaTesteada personaTesteada) {
		personaTesteadaDao.save(personaTesteada);
		System.out.println(personaTesteada.getDocumento());
		System.out.println("Se registro el documento correcto!!!!");
		}
	

	@Override
	public PersonaTesteada modificar(PersonaTesteada personaTesteada) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PersonaTesteada> listarpersonaTesteadas() {
		return personaTesteadaDao.findAll();
	}

	@Override
	public void eliminar(Long id) {
		personaTesteadaDao.deleteById(id);
		
	}

	@Override
	public Optional<PersonaTesteada> buscarPersonaTesteada(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaTesteada encontrarPersonaTesteada(Long id) throws Exception {
		return personaTesteadaDao.findById(id).orElseThrow(()-> new Exception("El Documento no existe"));
	}

	public void mapearPersonaTesteada(PersonaTesteada desde, PersonaTesteada hacia) {
		hacia.setDocumento(desde.getDocumento());
		hacia.setApellido(desde.getApellido());
		hacia.setNombres(desde.getNombres());
		hacia.setResultadoTesteo(desde.getResultadoTesteo());

	}
}