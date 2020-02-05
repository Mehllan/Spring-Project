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

import sr.model.Auth;
import sr.model.Country;
import sr.model.User;
import sr.model.UserType;
import sr.service.AuthService;
import sr.service.CountryService;

@Controller
public class AuthController
{
	@RequestMapping("/authsuccess")
	public ModelAndView welcomeMessage() throws ParseException 
	{
		 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	     AuthService as = (AuthService) context.getBean("authservice");
	     Set<Auth> savecountry = new HashSet<Auth>();
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
	    // savecountry.add(new Auth(1,"mgmg@gmail.com","mgmg",u));
	     savecountry.add(new Auth(2,"mgmg1@gmail.com","mgmg",u));
	     as.saveAll(savecountry);
	     System.out.println("Data have been saved");
	     
	 	// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("/authsuccess");
		return view;
	}
	 
}
