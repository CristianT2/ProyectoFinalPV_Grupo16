package ar.edu.unju.fi.testeos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;



public interface IRegistroTesteoDAO extends JpaRepository<RegistroTesteo, Long> {

}
