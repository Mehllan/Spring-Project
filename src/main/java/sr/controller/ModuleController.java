package sr.controller;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sr.model.Modules;
import sr.service.ModuleService;

@Controller
public class ModuleController
{
	@RequestMapping("/mdsuccess")
	public ModelAndView welcomeMessage() 
	{
		 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	     ModuleService uts = (ModuleService) context.getBean("mduleservice");
	     Set<Modules> usertypeset = new HashSet<Modules>();
	    // usertypeset.add(new Modules(1,"User Management",1)); 
	     usertypeset.add(new Modules(2,"Module Management",2));
	     //usertypeset.add(new Modules(3,"Module Management",3));
	     uts.saveAll(usertypeset);
	     System.out.println("Data have been saved");
	 	// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("/mdsuccess");
		return view;
	}
}
