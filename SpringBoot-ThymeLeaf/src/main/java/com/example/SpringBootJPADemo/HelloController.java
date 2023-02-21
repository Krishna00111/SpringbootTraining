package com.example.SpringBootJPADemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;



//
//
//@RestController
//public class HelloController {
//	
//	@RequestMapping("/hello")
//	public String sayHello() {
//		return "Hello, this is from Hello Controller";
//	}
//	@RequestMapping("/")
//	public String welcome() {
//	return "Here page.....changing this.....";
//  }
//	@RequestMapping("/")
//	public String welcome2() {
//		return "Hello";
//	}
//}
//
@Controller
public class HelloController{
	
	@GetMapping("/hello")
	public String Hello()
	{
		return "hello";//logical view name
	}
	
	//data is sent to view
	@RequestMapping("/emp")
	public ModelAndView details()
	{
		ModelAndView model = new ModelAndView(); //empty object
		model.addObject("company", "Wipro");
		model.addObject("Name","Chinmay");
		model.addObject("details");
		return model;
	}
	
	//receiving data from index.html and sending to empband.html
	//@PostMapping("/band")
	@RequestMapping(value="/band", method =  RequestMethod.POST)
	public String show(String band,Model m)
	{
		System.out.println(band);
		m.addAttribute("empinfo",  band);
		return "empband"; //logical viewname
	}
	
	//responding with raw response
	@ResponseBody
	@GetMapping("/band")
	
	public List<String> Hello2()
	{
		List<String> l1 = new ArrayList<>();
		l1.add("One");
		l1.add("two");
		l1.add("three");
		return l1;
	}
}

/*
 * 
 * if localhost:8080/band is sent from browser client - Get
 /hello - get
 /band - get
 /band - post, 
 /emp - get
 */


