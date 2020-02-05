package sr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tb_country")
public class Country
{
  private int id;
  private String country;
  private String language;
  private int country_code;
  private String nationality;
  
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() 
 {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public int getCountry_code() {
	return country_code;
}
public void setCountry_code(int country_code) 
{
	this.country_code = country_code;
}
public String getNationality()
{
	return nationality;
}
public void setNationality(String nationality)
{
	this.nationality = nationality;
}
public Country() 
{
	super();
}
public Country(int id, String country, String language, int country_code, String nationality) {
	super();
    this.id = id;
	this.country = country;
	this.language = language;
	this.country_code = country_code;
	this.nationality = nationality;
}
  
}
