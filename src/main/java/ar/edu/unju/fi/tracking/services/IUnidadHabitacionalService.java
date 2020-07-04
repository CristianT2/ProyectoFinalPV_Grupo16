package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;



public interface IUnidadHabitacionalService {


		public void crear(UnidadHabitacional unidadHabitacional);
		public UnidadHabitacional modificar();
		public void eliminar();
		public List listar();
		public Optional<UnidadHabitacional> encontrarUnidadHabitacional(Long id);
		void guardar(UnidadHabitacional unidadHabitacional);
		UnidadHabitacional modificar(UnidadHabitacional unidadHabitacional);
	}




