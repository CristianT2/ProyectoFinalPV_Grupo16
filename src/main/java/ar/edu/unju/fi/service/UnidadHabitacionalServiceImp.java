package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.repository.IUnidadHabitacionalRepository;
import ar.edu.unju.fi.testeos.model.UnidadHabitacional;

@Service
public class UnidadHabitacionalServiceImp implements IUnidadHabitacionalService {
	
	@Autowired
	IUnidadHabitacionalRepository unidadHabRepository;

	@Override
	public void crearUnidadHab(UnidadHabitacional unaUnidHab) {
		// TODO Auto-generated method stub
		unidadHabRepository.save(unaUnidHab);
	}

	@Override
	public void eliminarUnidadHab(Long id) {
		// TODO Auto-generated method stub
		unidadHabRepository.deleteById(id);
	}

	@Override
	public UnidadHabitacional modificar(UnidadHabitacional unaUnidHab) throws Exception {
		// TODO Auto-generated method stub
		return unidadHabRepository.save(unaUnidHab);
	}

	@Override
	public Iterable<UnidadHabitacional> listarUnidadHab() {
		// TODO Auto-generated method stub
		return unidadHabRepository.findAll();
	}

}
