package sr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sr.model.Role;
public interface RoleRepository extends JpaRepository<Role, Integer>
{

}
