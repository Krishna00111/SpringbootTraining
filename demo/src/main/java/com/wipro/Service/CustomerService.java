package com.wipro.Service;

import org.springframework.context.ApplicationContext;

import com.wipro.Customer;

public class CustomerService {
	
	double balance;
	String Id;
	
	public String checkLogin(String id, String password) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO dao = (CustomerDAO) context.getBean("dao");
		
		Customer cust = dao.getCustomer(id);
		
		if(cust!=null) {
			if(cust.getCustomerId().equals(id) && cust.getPassword().equals(password)) {
				Id=id;
				balance=cust.getBalance();
				return "valid";
			}else if (!cust.getPassword().equals(password)) {
				return "InvalidPassword";
				
			}else {
				return "Invalid";
			}
		}	else {
			return "InvalidId";
		}
	}

}