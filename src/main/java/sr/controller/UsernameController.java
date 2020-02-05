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
import sr.model.Username;
import sr.service.AuthService;
import sr.service.UsernameService;

@Controller
public class UsernameController 
{
	@RequestMapping("/usernamesuccess")
	public ModelAndView welcomeMessage() throws ParseException 
	{
		 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	     UsernameService uname_service = (UsernameService) context.getBean("usernameservie");
	     Set<Username> saveusername = new HashSet<Username>();
	     UserType utype = new UserType(1,"Administrator","Administrator can----");
	     Country c = new Country(1,"Myanmar","Myanmar",959,"Buddha");
	     String date = "January 4, 1995";
	     DateFormat df = new SimpleDateFormat("MMMM d,yyyy");
	     Date d = (Date) df.parse(date);
	     User u = new User(1,utype,c,d,1,"5/palana(n)103003");
	     Username uname = new Username(1,u,"mgmg@gmail.com","mgmg",1);
	     Username uname1 = new Username(2,u,"mgmg@gmail.com","mgmg",1);
	    // saveusername.add(uname);
	     saveusername.add(uname1);
	     uname_service.saveAll(saveusername);
	      // Name of your jsp file as parameter
			ModelAndView view = new ModelAndView("/usernamesuccess");
			return view;
	}
}
