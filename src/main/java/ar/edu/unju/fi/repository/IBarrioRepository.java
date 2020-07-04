package ar.edu.unju.fi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.trackpersonas.model.Barrio;

@Repository
public interface IBarrioRepository extends CrudRepository<Barrio, Long> {

}
