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
import sr.model.Country;
import sr.model.Phone;
import sr.model.User;
import sr.model.UserType;
import sr.model.Username;
import sr.service.PhoneService;
import sr.service.UsernameService;
@Controller
public class PhoneController {
	@RequestMapping("/phonesuccess")
	public ModelAndView welcomeMessage() throws ParseException 
	{
		 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	     PhoneService phone_service = (PhoneService) context.getBean("phoneservice");
	     Set<Phone> savephone = new HashSet<Phone>();
	     UserType utype = new UserType(1,"Administrator","Administrator can----");
	     Country c = new Country(1,"Myanmar","Buddha",959,"Myanmar");
	     String date = "January 4, 1995";
	     DateFormat df = new SimpleDateFormat("MMMM d,yyyy");
	     Date d = (Date) df.parse(date);
	     User u = new User(1,utype,c,d,2,"5/palana(n)103003");
	     Phone ph = new Phone();
	    /* ph.setC(c);
	     ph.setUser(u);
	     ph.setId(1);
	     ph.setPhone("09798195924");
	     ph.setPhone_type(1);*/
	     
	     ph.setC(c);
	     ph.setUser(u);
	     ph.setId(2);
	     ph.setPhone("09798195924");
	     ph.setPhone_type(1);
	     savephone.add(ph);
	     phone_service.saveAll(savephone);
	      // Name of your jsp file as parameter
			ModelAndView view = new ModelAndView("/phonesuccess");
			return view;
	}
}
