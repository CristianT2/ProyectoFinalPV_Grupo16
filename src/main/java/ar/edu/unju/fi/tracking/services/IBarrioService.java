package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;


import ar.edu.unju.fi.trackpersonas.model.Barrio;

public interface IBarrioService {
	
		public void crear(Barrio barrio);
		public Barrio modificar();
		public void eliminar();
		public List listar();
		public Optional<Barrio> encontrarBarrio(Long id);
		void guardar(Barrio barrio);
		Barrio modificar(Barrio barrio);
	}


