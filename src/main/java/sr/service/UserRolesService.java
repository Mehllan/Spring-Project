package sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.UserRoles;
import sr.repository.UserRolesRepository;

public class UserRolesService
{
  @Autowired
  private UserRolesRepository userrolesRepository;
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<UserRoles> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<UserRoles> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserRoles> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends UserRoles> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends UserRoles> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserRoles> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public UserRoles getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends UserRoles> List<S> saveAll(Iterable<S> userroleslist) {
		// TODO Auto-generated method stub
		return userrolesRepository.saveAll(userroleslist) ;
	}

	public <S extends UserRoles> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<UserRoles> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(UserRoles arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends UserRoles> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Optional<UserRoles> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends UserRoles> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends UserRoles> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends UserRoles> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends UserRoles> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends UserRoles> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
