package com.example.SB_Freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String Hello()
	{
		return "hello";
	}
	
	@RequestMapping("/emp")
	public ModelAndView model = new ModelAndView();
	model.addObject("Name", "Chinmay");
	model.addObject("company","Wipro");
	model.setViewName("details");
	return model; 
    }
    
    @RequestMapping("/")
    
    
    public String welcome()
    {
    	return "welcome";
    }
	
}
