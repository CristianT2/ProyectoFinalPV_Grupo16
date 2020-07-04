package ar.edu.unju.fi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;

@Repository
public interface IRegistroTesteoRepository extends CrudRepository<RegistroTesteo, Long>{

}
