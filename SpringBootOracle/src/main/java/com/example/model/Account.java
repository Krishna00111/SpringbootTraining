package com.example.model;


@Entity
public class Account {
	
	@Id
	@GeneratedValue
	Long id;
	
	String fname, lname, email;
	
	public Account() {
		//TODO Auto-generated constructor stub
	}
	
	public Account(String fname, String lname, String email) {
		super();
		this.fname=fname;
		this.lname=lname;
		this.email=email;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [id=" +id+",fname="+fname+",lname="+lname+",email="+email+"]";
	}
    
	public Long getId() {
		return id;
	}
	
	
	
	
	
    
	public void setId(Long id) {
		this.id=id;
	}
	
	
	public String getFname() {
		
	}
	
}
