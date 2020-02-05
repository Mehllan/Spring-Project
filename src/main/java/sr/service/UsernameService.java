package sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.Username;
import sr.repository.UsernameRepository;

public class UsernameService implements UsernameRepository
{
@Autowired 
private UsernameRepository usrnameRepository;
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<Username> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<Username> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Username> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Username> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Username> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Username> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Username getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Username> List<S> saveAll(Iterable<S> username) {
		// TODO Auto-generated method stub
		return usrnameRepository.saveAll(username);
	}

	public <S extends Username> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Username> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Username arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Username> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<Username> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Username> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Username> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Username> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends Username> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Username> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
