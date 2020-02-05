package sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sr.model.Auth;
public interface AuthRepository extends JpaRepository<Auth, Integer>
{

}
