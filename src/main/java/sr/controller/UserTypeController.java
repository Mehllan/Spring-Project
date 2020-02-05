package sr.controller;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sr.model.UserType;
import sr.service.UserTypeService;
@Controller
public class UserTypeController 
{
	
	@RequestMapping("/utsuccess")
	public ModelAndView welcomeMessage() 
	{
		 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	     UserTypeService uts = (UserTypeService) context.getBean("usertypeservice");
	     Set<UserType> usertypeset = new HashSet<UserType>();
	     //usertypeset.add(new UserType(4,"Non-teaching staff","Administrator can---")); 
	     usertypeset.add(new UserType(5,"Non-teaching staff","Administrator can---")); 
	     uts.saveAll(usertypeset);
	     System.out.println("Data have been saved");
	 	// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("/utsuccess");
		return view;
	}
}
