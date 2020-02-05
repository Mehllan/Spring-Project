package sr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sr.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
