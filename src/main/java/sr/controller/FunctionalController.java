package sr.controller;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sr.model.Functional;
import sr.service.FunctionalService;
@Controller
public class FunctionalController 
{
	@RequestMapping("/funsuccess")
	public ModelAndView welcomeMessage() 
	{
		 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
	     FunctionalService fs = (FunctionalService) context.getBean("funservice");
	     Set<Functional> savefun = new HashSet<Functional>();
	    // savefun.add(new Functional(1,"Add",1,"1","success"));
	     savefun.add(new Functional(2,"Add",2,"2","fail"));
	    // savefun.add(new Functional(3,"Delete",3,"3","fail"));
	     fs.saveAll(savefun);
	     System.out.println("Data have been saved");
	 	// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("/funsuccess");
		return view;
	}
}
