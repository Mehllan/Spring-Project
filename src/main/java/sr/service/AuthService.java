package sr.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import sr.model.Auth;
import sr.repository.AuthRepository;
public class AuthService
{
	@Autowired
	private AuthRepository authRepository;
	public void deleteAllInBatch()
	{
		
		
	}

	public void deleteInBatch(Iterable<Auth> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<Auth> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Auth> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Auth> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Auth> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Auth> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Auth getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Auth> List<S> saveAll(Iterable<Auth> authset) 
	{
		return (List<S>) authRepository.saveAll(authset);
	}

	public <S extends Auth> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Auth> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Auth arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Auth> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<Auth> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Auth> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Auth> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Auth> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends Auth> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Auth> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
