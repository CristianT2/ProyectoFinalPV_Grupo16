package ar.edu.unju.fi.tracking.services;


import java.util.Optional;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;






	public interface IRegistroTesteoService {
		public void guardar(RegistroTesteo registroTesteo);
		public RegistroTesteo modificar(RegistroTesteo registroTesteo) throws Exception;
		public Iterable<RegistroTesteo> listarregistroTesteos();
		public void eliminar(Long id);
		public Optional<RegistroTesteo>buscarRegistroTesteo(Long id);
		public RegistroTesteo encontrarRegistroTesteo(Long id) throws Exception;
		
	}




