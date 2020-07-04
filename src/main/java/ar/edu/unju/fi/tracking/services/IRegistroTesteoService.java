package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;


public interface IRegistroTesteoService {

	
		public void crear(RegistroTesteo registroTesteo);
		public RegistroTesteo modificar();
		public void eliminar();
		public List listar();
		public Optional<RegistroTesteo> encontrarRegistroTesteo(Long id);
		void guardar(RegistroTesteo registroTesteo);
		RegistroTesteo modificar(RegistroTesteo registroTesteo);
	}




