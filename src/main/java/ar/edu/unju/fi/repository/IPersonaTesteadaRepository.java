package ar.edu.unju.fi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;

@Repository
public interface IPersonaTesteadaRepository extends CrudRepository<PersonaTesteada, Long>{

}
