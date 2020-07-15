package ar.edu.unju.fi.tracking.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;
import ar.edu.unju.fi.testeos.repository.IRegistroTesteoDAO;


@Service
public class IRegistroTesteoServiceImp implements IRegistroTesteoService{
	
			@Autowired
			IRegistroTesteoDAO registroTesteoDao;

			@Override
			public void guardar(RegistroTesteo registroTesteo) {
			registroTesteoDao.save(registroTesteo);
			System.out.println(registroTesteo.getFechaHora());
			System.out.println("Se registro el registro correcto!!!!");
			}

			@Override
			public RegistroTesteo modificar(RegistroTesteo registroTesteo) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterable<RegistroTesteo> listarregistroTesteos() {
				return registroTesteoDao.findAll();
			}

			@Override
			public void eliminar(Long id) {
				registroTesteoDao.deleteById(id);
			}

			@Override
			public Optional<RegistroTesteo> buscarRegistroTesteo(Long id) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public RegistroTesteo encontrarRegistroTesteo(Long id) throws Exception {
				return registroTesteoDao.findById(id).orElseThrow(()-> new Exception("El Registro no existe"));
			}

	
		

}
