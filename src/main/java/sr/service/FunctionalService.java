package sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.Functional;
import sr.repository.FunctionalRepository;
public class FunctionalService
{
	@Autowired
	private FunctionalRepository functionalRepository;
	public void deleteAllInBatch() 
	{
		
	}

	public void deleteInBatch(Iterable<Functional> arg0) 
	{
	
	}

	public List<Functional> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Functional> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Functional> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Functional> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Functional> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Functional getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Functional> List<S> saveAll(Iterable<S> functionset) 
	{
		return functionalRepository.saveAll(functionset);
	}

	public <S extends Functional> S saveAndFlush(S arg0) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Functional> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Functional arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Functional> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<Functional> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Functional> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Functional> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Functional> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends Functional> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Functional> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
