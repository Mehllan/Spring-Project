package sr.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tb_modules")
public class Modules
{
private int id;
private String name;
private int parentid;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
@Column(unique = true)
public void setName(String name) {
	this.name = name;
}
@Column(unique = true)
public int getParentid() 
{
	return parentid;
}
public void setParentid(int parentid) {
	this.parentid = parentid;
}
public Modules() {
	super();
}
public Modules(int id, String name, int parentid) {
	super();
	this.id = id;
	this.name = name;
	this.parentid = parentid;
}
}
