package sr.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sr.model.Country;
import sr.service.CountryService;
@Controller
public class CountryController
{
@RequestMapping("/success")
public ModelAndView welcomeMessage() 
{
	 ApplicationContext context = new FileSystemXmlApplicationContext("D:/SpringWorkSpace/TestWebApplication/src/main/resources/SpringConfig.xml");
     CountryService cs = (CountryService) context.getBean("countryservice");
     Set<Country> savecountry = new HashSet<Country>();
    // savecountry.add(new Country(12,"dd","+d",12,"dd"));
    // savecountry.add(new Country(14,"cc","cc",78,"cc"));
     
     savecountry.add(new Country(15,"cc","cc",78,"cc"));
     cs.saveAll(savecountry);
     System.out.println("Data have been saved");
 	// Name of your jsp file as parameter
	ModelAndView view = new ModelAndView("/success");
	return view;
}
 
}
