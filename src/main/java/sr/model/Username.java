package sr.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_username")
public class Username 
{
 private int id;
 private User user;
 private String name;
 private String family_name;
 private int priority;
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column (unique = true)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "user_id")
public User getUser() 
{
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getName() {
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getFamily_name() {
	return family_name;
}
public void setFamily_name(String family_name) {
	this.family_name = family_name;
}
@Column(unique = true)
public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}
public Username() {
	super();
}
public Username(int id, User user, String name, String family_name, int priority) {
	super();
	this.id = id;
	this.user = user;
	this.name = name;
	this.family_name = family_name;
	this.priority = priority;
}
 
}
