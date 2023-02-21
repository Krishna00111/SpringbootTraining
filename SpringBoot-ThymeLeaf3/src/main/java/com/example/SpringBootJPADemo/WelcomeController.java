package com.example.SpringBootJPADemo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	
	@RequestMapping("/welcome")
	public String sayHello() {
		return "Hello, this is from Welcome Controller";
	}
	 
	@RequestMapping("/list")
	public List<String> getList() {
		List<String> l1 = new ArrayList<>();
		l1.add("One");
		l1.add("Two");
		return l1;
		//return "Hello, this is from Welcome Controller";
	}
	
	@RequestMapping("/Welcome")
	public String sendWelcome() {
		return "<html><body><h3>this is the response</h3></body></html>";
	}

}
