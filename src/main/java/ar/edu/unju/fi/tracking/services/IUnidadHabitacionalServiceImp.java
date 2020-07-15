package ar.edu.unju.fi.tracking.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;
import ar.edu.unju.fi.testeos.repository.IUnidadHabitacionalDAO;

@Service
public class IUnidadHabitacionalServiceImp implements IUnidadHabitacionalService {

		@Autowired
		 IUnidadHabitacionalDAO unidadHabitacionalDao;

		@Override
		public void guardar(UnidadHabitacional unidadHabitacional) {
			unidadHabitacionalDao.save(unidadHabitacional);
			System.out.println(unidadHabitacional.getDireccion());
			System.out.println("Se registro la direccion correcta!!!!");
			
		}

		@Override
		public UnidadHabitacional modificar(UnidadHabitacional unidadHabitacional) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Iterable<UnidadHabitacional> listarunidadHabitacionales() {
			return unidadHabitacionalDao.findAll();
		}

		@Override
		public void eliminar(Long id) {
			unidadHabitacionalDao.deleteById(id);
			
		}

		@Override
		public Optional<UnidadHabitacional> buscarUnidadHabitacional(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public UnidadHabitacional encontrarUnidadHabitacional(Long id) throws Exception {
			return unidadHabitacionalDao.findById(id).orElseThrow(()-> new Exception("La direccion no existe"));
		}
}

	