package sr.model;

import java.util.Date;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_user")
public class User 
{
private int id;
private UserType user_type;
private Country country;
private Date dob;
private int gender;
private String nirc;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "user_type_id")
public UserType getUser_type() 
{
	return user_type;
}
public void setUser_type(UserType user_type)
{
	this.user_type = user_type;
}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn ( name = "country_id")
public Country getCountry() 
{
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getGender() {
	return gender;
}
public void setGender(int gender) 
{
	this.gender = gender;
}
public String getNirc() {
	return nirc;
}
public void setNirc(String nirc) 
{
	this.nirc = nirc;
}
public User() {
	super();
}
public User(int id, UserType user_type, Country country, Date dob, int gender, String nirc) {
	super();
	this.id = id;
	this.user_type = user_type;
	this.country = country;
	this.dob = dob;
	this.gender = gender;
	this.nirc = nirc;
}
}
