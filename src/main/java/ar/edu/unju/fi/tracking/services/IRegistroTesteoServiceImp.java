package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;
import ar.edu.unju.fi.testeos.repository.IRegistroTesteoDAO;

@Service
public class IRegistroTesteoServiceImp implements IRegistroTesteoService{
	
			@Autowired
			@Qualifier("registroTesteoDaoImp")
			private IRegistroTesteoDAO registroTesteoDaoImp;

			@Override
			public void crear(RegistroTesteo registroTesteo) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public RegistroTesteo modificar() {
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
			public Optional<RegistroTesteo> encontrarRegistroTesteo(Long id) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void guardar(RegistroTesteo registroTesteo) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public RegistroTesteo modificar(RegistroTesteo registroTesteo) {
				// TODO Auto-generated method stub
				return null;
			}

}
