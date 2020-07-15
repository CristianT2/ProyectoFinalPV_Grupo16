package ar.edu.unju.fi.tracking.services;


import java.util.List;
import java.util.Optional;


import ar.edu.unju.fi.trackpersonas.model.Barrio;

public interface IBarrioService {
	
		public void guardar(Barrio barrio);
		public Barrio modificar(Barrio barrio) throws Exception;
		public Iterable<Barrio> listarBarrios();
		public void eliminar(Long id);

		public Optional<Barrio>buscarBarrio(Long id);
		public Barrio encontrarBarrio(Long id) throws Exception;
		public List<Barrio> getAllBarrios();
	}



