package sr.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_address")
public class Address
{
private int id;
private User user;
private String address;
private double longitude;
private double latitude;

public Address() {
	super();
}

public Address(int id, User user, String address, double longitude, double latitude) {
	super();
	this.id = id;
	this.user = user;
	this.address = address;
	this.longitude = longitude;
	this.latitude = latitude;
}
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@ManyToOne(cascade= CascadeType.ALL)
@JoinColumn(name = "user_id")
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
}
