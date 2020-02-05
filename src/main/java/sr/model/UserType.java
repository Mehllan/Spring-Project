package sr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_user_type")
public class UserType
{
private int id;
private String name;
private String description;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId()
{
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(unique = true)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public UserType() {
	super();
}
public UserType(int id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
}

}
