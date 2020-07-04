package ar.edu.unju.fi.service;

import ar.edu.unju.fi.tracking.model.Rol;

public interface IRolService {
	public void guardarRol(Rol unRol);
	public void eliminarRol(Long id);
	public Iterable<Rol>listarRoles();

}
