package ar.edu.unju.fi.testeos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;



public interface IPersonaTesteadaDAO extends JpaRepository<PersonaTesteada, Long> {
	public Optional<PersonaTesteada> findByDocumento(String documento);
}
