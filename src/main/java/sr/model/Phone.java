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
@Table (name = "tb_phone")
public class Phone 
{
private int id;
private User user;
private Country c;
private String phone;
private int phone_type;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId()
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "user_id")
public User getUser() 
{
	return user;
}
public void setUser(User user)
{
	this.user = user;
}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "country_id")
public Country getC()
{
	return c;
}
public void setC(Country c) {
	this.c = c;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getPhone_type() {
	return phone_type;
}
public void setPhone_type(int phone_type) {
	this.phone_type = phone_type;
}
public Phone() {
	super();
}
public Phone(int id, User user, Country c, String phone, int phone_type) {
	super();
	this.id = id;
	this.user = user;
	this.c = c;
	this.phone = phone;
	this.phone_type = phone_type;
}

}
