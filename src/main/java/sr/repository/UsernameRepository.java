package sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sr.model.Username;
public interface UsernameRepository extends JpaRepository<Username,Integer>
{

}
