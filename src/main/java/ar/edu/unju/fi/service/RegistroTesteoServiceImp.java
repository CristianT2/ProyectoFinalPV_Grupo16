package ar.edu.unju.fi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.repository.IRegistroTesteoRepository;
import ar.edu.unju.fi.testeos.model.RegistroTesteo;

@Service
public class RegistroTesteoServiceImp implements IRegistroTesteoService {
	
	@Autowired
	IRegistroTesteoRepository registroRepository;

	@Override
	public void guardarRegistro(RegistroTesteo unRegistro) {
		// TODO Auto-generated method stub
		registroRepository.save(unRegistro);
	}

	@Override
	public void eliminarRegistro(Long id) {
		// TODO Auto-generated method stub
		registroRepository.deleteById(id);
	}

	@Override
	public Iterable<RegistroTesteo> ListarRegistros() {
		// TODO Auto-generated method stub
		return registroRepository.findAll();
	}

	@Override
	public Optional<RegistroTesteo> obtenerUnRegistro(Long id) {
		// TODO Auto-generated method stub
		return registroRepository.findById(id);
	}

}
