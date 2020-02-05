package sr.controller;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sr.model.Role;
import sr.service.RoleService;
@Controller
public class RoleController
{
	@RequestMapping("/role_success")
	public ModelAndView welcomeMessage() throws ParseException
	{
	ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	RoleService roleservice = (RoleService) context.getBean("roleservice");
    Set<Role> role_set = new HashSet<Role>();
   // role_set.add(new Role(1,"Admin","Admin can--"));
    role_set.add(new Role(2,"Teaching-staff","Admin can--"));
    roleservice.saveAll(role_set);//save to database
    // Name of your jsp file as parameter
 	ModelAndView view = new ModelAndView("/role_success");
 	return view;
	}
}
