package sr.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sr.model.Address;
import sr.model.Country;
import sr.model.User;
import sr.model.UserType;
import sr.service.AddressService;
@Controller
public class AddressController 
{
	@RequestMapping("/addresssuccess")
	public ModelAndView welcomeMessage() throws ParseException
	{
	ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	AddressService as = (AddressService) context.getBean("addressservice");
	
	User u = new User();
    UserType user_type = new UserType(1,"Administrator","Administrator can--");
    Country c = new Country(1,"Myanmar","Buddha",959,"Myanmar");
    u.setId(1);
    u.setUser_type(user_type);
    u.setCountry(c);
    String date = "January 4, 1995";
    DateFormat df = new SimpleDateFormat("MMMM d,yyyy");
    Date d = (Date) df.parse(date);
    u.setDob(d);
    u.setGender(1);
    u.setNirc("5/palana(n)103003");
    Address address = new Address();
    address.setId(1);
    address.setAddress("Yangon");
    address.setLongitude(23.4);
    address.setLatitude(34.5);
    address.setUser(u);
    
    Address address1 = new Address();
    address1.setId(2);
    address1.setAddress("Yangon");
    address1.setLongitude(23.4);
    address1.setLatitude(34.5);
    address1.setUser(u);
    
    Set<Address> address_set = new HashSet<Address>();
   // address_set.add(address);
    address_set.add(address1);
    as.saveAll(address_set); //save to database
    
   // Name of your jsp file as parameter
 	ModelAndView view = new ModelAndView("/addresssuccess");
 	return view;
	}
}
