package ar.edu.unju.fi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.repository.IBarrioRepository;
import ar.edu.unju.fi.trackpersonas.model.Barrio;

@Service
public class BarrioServiceImp implements IBarrioService {
	
	@Autowired
	IBarrioRepository barrioRepository;


	@Override
	public void eliminarBarrio(Long id) {
		// TODO Auto-generated method stub
		barrioRepository.deleteById(id);
	}

	@Override
	public Iterable<Barrio> listarBarrios() {
		// TODO Auto-generated method stub
		return barrioRepository.findAll();
	}

	@Override
	public void guardarBarrio(Barrio unBarrio) {
		// TODO Auto-generated method stub
		barrioRepository.save(unBarrio);
	}

	@Override
	public Optional<Barrio> obtenerUnBarrio(Long id) {
		// TODO Auto-generated method stub
		return barrioRepository.findById(id);
	}

}
