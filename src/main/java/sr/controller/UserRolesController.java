package sr.controller;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sr.model.UserRoles;
import sr.service.UserRolesService;

@Controller
public class UserRolesController 
{
	@RequestMapping("/userrole_success")
	public ModelAndView welcomeMessage() throws ParseException
	{
	ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	UserRolesService as = (UserRolesService) context.getBean("userrolesservice");
	UserRoles userroles = new UserRoles();
	userroles.setId(1);
	userroles.setUser_id(1);
	userroles.setRole_id(1);
	
	/*UserRoles userroles1 = new UserRoles();
	userroles1.setId(1);
	userroles1.setUser_id(1);
	userroles1.setRole_id(1);*/
	
	Set<UserRoles> uset = new HashSet<UserRoles>();
	uset.add(userroles);
	//uset.add(userroles1);
    as.saveAll(uset); //save to database
    
   // Name of your jsp file as parameter
 	ModelAndView view = new ModelAndView("/userrole_success");
 	return view;
	}
}
