package ar.edu.unju.fi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tracking.model.Rol;

@Repository
public interface IRolRepository extends CrudRepository<Rol, Long>{

}
