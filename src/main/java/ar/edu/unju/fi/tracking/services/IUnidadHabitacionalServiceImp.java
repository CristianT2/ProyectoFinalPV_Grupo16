package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;
import ar.edu.unju.fi.testeos.repository.IUnidadHabitacionalDAO;

@Service
public class IUnidadHabitacionalServiceImp implements IUnidadHabitacionalService {

		@Autowired
		@Qualifier("unidadHabitacionalDaoImp")
		private IUnidadHabitacionalDAO unidadHabitacionalDaoImp;

		@Override
		public void crear(UnidadHabitacional unidadHabitacional) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public UnidadHabitacional modificar() {
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
		public Optional<UnidadHabitacional> encontrarUnidadHabitacional(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void guardar(UnidadHabitacional unidadHabitacional) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public UnidadHabitacional modificar(UnidadHabitacional unidadHabitacional) {
			// TODO Auto-generated method stub
			return null;
		}
}
