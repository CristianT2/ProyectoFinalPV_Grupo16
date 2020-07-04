package ar.edu.unju.fi.tracking.services;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import ar.edu.unju.fi.trackpersonas.model.Barrio;
import ar.edu.unju.fi.trackpersonas.repository.IBarrioDAO;
@Service
public class IBarrioServiceImp implements IBarrioService{ 
		@Autowired
		@Qualifier("barrioDaoImp")
		private IBarrioDAO barrioDaoImp;

		@Override
		public void crear(Barrio barrio) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Barrio modificar() {
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
		public Optional<Barrio> encontrarBarrio(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void guardar(Barrio barrio) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Barrio modificar(Barrio barrio) {
			// TODO Auto-generated method stub
			return null;
		}
}
