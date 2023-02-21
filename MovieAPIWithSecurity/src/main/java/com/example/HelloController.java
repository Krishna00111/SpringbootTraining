package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//
//
@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String home() {
		return "Home Page";
	}
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello, this is from Hello Controller";
	}
	@RequestMapping("/")
	public String welcome() {
	return "Here page.....changing this.....";
  }
	@RequestMapping("/")
	public String welcome2() {
		return "Hello";
	}
}

