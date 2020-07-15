package ar.edu.unju.fi.tracking.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import ar.edu.unju.fi.trackpersonas.model.Barrio;
import ar.edu.unju.fi.trackpersonas.repository.IBarrioDAO;

@Service
public class IBarrioServiceImp implements IBarrioService {
	@Autowired
	IBarrioDAO barrioDao;

	@Override
	public void guardar(Barrio barrio) {
	barrioDao.save(barrio);
	System.out.println(barrio.getNombre());
	System.out.println("Se registro el barrio correcto!!!!");
	}

	@Override
	public Optional<Barrio> buscarBarrio(Long id) {
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public Iterable<Barrio> listarBarrios() {
	return barrioDao.findAll();
	}

	@Override
	public void eliminar(Long id) {
	barrioDao.deleteById(id);

	}

	@Override
	public Barrio encontrarBarrio(Long id) throws Exception {
	return barrioDao.findById(id).orElseThrow(()-> new Exception("El Barrio no existe"));
	}

	@Override
	public Barrio modificar(Barrio barrio)throws Exception {
	Barrio barrioGuardar = encontrarBarrio(barrio.getId());
	mapearBarrio(barrio, barrioGuardar);
	return barrioDao.save(barrioGuardar);
	}
	public void mapearBarrio(Barrio desde, Barrio hacia) {
		hacia.setNombre(desde.getNombre());
		
}

	@Override
	public List<Barrio> getAllBarrios() {
		// TODO Auto-generated method stub
		return barrioDao.findAll();
	}
}
