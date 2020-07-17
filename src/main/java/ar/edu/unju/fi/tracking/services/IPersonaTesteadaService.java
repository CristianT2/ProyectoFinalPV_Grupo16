package ar.edu.unju.fi.tracking.services;


import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;




public interface IPersonaTesteadaService {

	
		public void guardar(PersonaTesteada personaTesteada);
		public PersonaTesteada modificar(PersonaTesteada personaTesteada) throws Exception;
		public Iterable<PersonaTesteada> listarpersonaTesteadas();
		public void eliminar(Long id);
		public Optional<PersonaTesteada>buscarPersonaTesteada(Long id);
		public PersonaTesteada encontrarPersonaTesteada(Long id) throws Exception;
		public PersonaTesteada byFindDniPersonaTesteada(String documento) throws Exception;
		public List<PersonaTesteada> byFindApellidoPersonas();
	}
