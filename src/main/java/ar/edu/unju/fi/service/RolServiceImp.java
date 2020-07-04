package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.repository.IRolRepository;
import ar.edu.unju.fi.tracking.model.Rol;

@Service
public class RolServiceImp implements IRolService {

	@Autowired
	IRolRepository rolRepository;
	
	@Override
	public void guardarRol(Rol unRol) {
		// TODO Auto-generated method stub
		rolRepository.save(unRol);
	}

	@Override
	public void eliminarRol(Long id) {
		// TODO Auto-generated method stub
		rolRepository.deleteById(id);
	}

	@Override
	public Iterable<Rol> listarRoles() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}
