package com.example.SB_Freemarker;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {
	
	@ResponseBody
	@RequestMapping("/")
	public String displayWelcome() {
		return "Welcome to First day of SB Session.....";
	}
	
	@RequestMapping("/hi")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("h1");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/html")
	public String sayHelloHtml() {
		return "<html><body><h1>Hi, How are you??</h1><body></html>";
	}

}

//	@RequestMapping("/welcome")
//	public String sayHello() {
//		return "Hello, this is from Welcome Controller";
//	}
//	 
//	@RequestMapping("/list")
//	public List<String> getList() {
//		List<String> l1 = new ArrayList<>();
//		l1.add("One");
//		l1.add("Two");
//		return l1;
//		//return "Hello, this is from Welcome Controller";
//	}
//	
//	@RequestMapping("/Welcome")
//	public String sendWelcome() {
//		return "<html><body><h3>this is the response</h3></body></html>";
//	}
//
//}
