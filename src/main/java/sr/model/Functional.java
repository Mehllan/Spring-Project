package sr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tb_functional")
public class Functional
{
 private int id;
 private String name;
 private int uitype;
 private String uiid;
 private String actionurl;
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
public String getName()
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public int getUitype() 
{
	return uitype;
}
public void setUitype(int uitype) 
{
	this.uitype = uitype;
}

public String getUiid() {
	return uiid;
}
public void setUiid(String uiid) {
	this.uiid = uiid;
}
public String getActionurl() 
{
	return actionurl;
}
public void setActionurl(String actionurl) 
{
	this.actionurl = actionurl;
}
public Functional() 
{
	super();
}
public Functional(int id, String name, int uitype, String uiid, String actionurl) 
{
	super();
	this.id = id;
	this.name = name;
	this.uitype = uitype;
	this.uiid = uiid;
	this.actionurl = actionurl;
}
 
}
