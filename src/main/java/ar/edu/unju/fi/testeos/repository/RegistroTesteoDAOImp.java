package ar.edu.unju.fi.testeos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;

@Repository("registroTesteoDAOImp")
public class RegistroTesteoDAOImp implements IRegistroTesteoDAO {
	//Autowired
public RegistroTesteo registroTesteo;

@Override
public List<RegistroTesteo> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<RegistroTesteo> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<RegistroTesteo> findAllById(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends RegistroTesteo> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends RegistroTesteo> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<RegistroTesteo> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public RegistroTesteo getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends RegistroTesteo> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends RegistroTesteo> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<RegistroTesteo> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends RegistroTesteo> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Optional<RegistroTesteo> findById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean existsById(Long id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void deleteById(Long id) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(RegistroTesteo entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends RegistroTesteo> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends RegistroTesteo> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends RegistroTesteo> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends RegistroTesteo> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends RegistroTesteo> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
}

