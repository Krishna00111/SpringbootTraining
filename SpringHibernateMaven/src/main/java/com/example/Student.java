package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.persistence.Entity;


//
//

@Entity
public class Student {
	
//	@RequestMapping("/")
//	public String home() {
//		return "Home Page";
//	}
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
	
	@Id
	private int sid;
	
	
	
	//private String, 
	
	private String sname;
	private String saddress;
    public Student() {
    	super();
    }
    
    public Student(int sid, String sname, String saddress) {
    	super();
    	this.sid=sid;
    	this.sname=sname;
    	this.saddress=saddress;
    }
    
    public int getSid() {
    	return sid;
    }
    
}


