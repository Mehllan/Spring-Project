package sr.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import sr.model.Role;
import sr.repository.RoleRepository;

public class RoleService
{
@Autowired
private RoleRepository roleRepository;

public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

public void deleteInBatch(Iterable<Role> arg0) {
	// TODO Auto-generated method stub
	
}

public List<Role> findAll() {
	// TODO Auto-generated method stub
	return null;
}

public List<Role> findAll(Sort arg0) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Role> List<S> findAll(Example<S> arg0) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Role> List<S> findAll(Example<S> arg0, Sort arg1) {
	// TODO Auto-generated method stub
	return null;
}

public List<Role> findAllById(Iterable<Integer> arg0) {
	// TODO Auto-generated method stub
	return null;
}

public void flush() {
	// TODO Auto-generated method stub
	
}

public Role getOne(Integer arg0) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Role> List<S> saveAll(Iterable<S> rolelist) {
	// TODO Auto-generated method stub
	return roleRepository.saveAll(rolelist);
}

public <S extends Role> S saveAndFlush(S arg0) {
	// TODO Auto-generated method stub
	return null;
}

public Page<Role> findAll(Pageable arg0) {
	// TODO Auto-generated method stub
	return null;
}

public long count() {
	// TODO Auto-generated method stub
	return 0;
}

public void delete(Role arg0) {
	// TODO Auto-generated method stub
	
}

public void deleteAll() {
	// TODO Auto-generated method stub
	
}

public void deleteAll(Iterable<? extends Role> arg0) {
	// TODO Auto-generated method stub
	
}

public void deleteById(Integer arg0) {
	// TODO Auto-generated method stub
	
}

public boolean existsById(Integer arg0) {
	// TODO Auto-generated method stub
	return false;
}

public Optional<Role> findById(Integer arg0) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Role> S save(S role) {
	// TODO Auto-generated method stub
	return roleRepository.save(role);
}

public <S extends Role> long count(Example<S> arg0) {
	// TODO Auto-generated method stub
	return 0;
}

public <S extends Role> boolean exists(Example<S> arg0) {
	// TODO Auto-generated method stub
	return false;
}

public <S extends Role> Page<S> findAll(Example<S> arg0, Pageable arg1) {
	// TODO Auto-generated method stub
	return null;
}

public <S extends Role> Optional<S> findOne(Example<S> arg0) {
	// TODO Auto-generated method stub
	return null;
}


}
