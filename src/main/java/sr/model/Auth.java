package sr.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_auth")
public class Auth 
{
private int id;
private String username;
private String password;
private User user;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() 
{
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn (name = "user_id")
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Auth() {
	super();
}
public Auth(int id, String username, String password, User user) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.user = user;
}
}
