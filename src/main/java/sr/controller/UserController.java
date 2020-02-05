package sr.controller;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sr.model.Country;
import sr.model.User;
import sr.model.UserType;
import sr.service.UserService;
@Controller
public class UserController
{
	@RequestMapping("/usersuccess")
	public ModelAndView welcomeMessage() throws ParseException 
	{
		 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	     UserService us = (UserService) context.getBean("userservice");
	     UserType utype = new UserType();
	     utype.setId(1);
	     utype.setName("Student");
	     utype.setDescription("Student can--");
	     Country c = new Country(3,"Japan","Japanese",87,"Buddha");
	     Set<User> saveuser = new HashSet<User>();
	     String date = "January 4, 1995";
	     DateFormat df = new SimpleDateFormat("MMMM d,yyyy");
	     Date d = (Date) df.parse(date);
	    // saveuser.add(new User(3,utype,c,d,3,"5/palana(n)123455"));
	     saveuser.add(new User(4,utype,c,d,3,"5/palana(n)123455"));
	     us.saveAll(saveuser);
	     System.out.println("Data have been saved");
	 	// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("/usersuccess");
	
		return view;
	}
}
