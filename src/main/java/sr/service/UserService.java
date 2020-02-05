package sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import sr.model.User;
import sr.repository.UserRepository;
public class UserService implements UserRepository
{
	@Autowired
	private UserRepository userRepository;
	public void deleteAllInBatch() 
	{
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<User> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public User getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> List<S> saveAll(Iterable<S> userset) {
		// TODO Auto-generated method stub
		return userRepository.saveAll(userset);
	}

	public <S extends User> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<User> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(User arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<User> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends User> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends User> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
