package sr.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tb_user_roles")
public class UserRoles
{
private int id;
private int user_id;
private int role_id;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(unique = true)
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
@Column(unique = true)
public int getRole_id() {
	return role_id;
}
public void setRole_id(int role_id) {
	this.role_id = role_id;
}
public UserRoles() {
	super();
}
public UserRoles(int id, int user_id, int role_id) {
	super();
	this.id = id;
	this.user_id = user_id;
	this.role_id = role_id;
}

}
