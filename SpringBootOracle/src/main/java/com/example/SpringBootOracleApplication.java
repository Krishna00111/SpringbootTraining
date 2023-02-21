package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOracleApplication.class, args);
	}
	
	
	
	
	
	
	@Postconstruct
	public void init() {
		System.out.println("Inside save");
		Account a1=new Account("harekrishna", "harekrishna", "harekrishna@gmail,com");
		Account a2=new Account("harekrishna", "harekrishna", "harekrishna@gmail,com");
		Account a3=new Account("harekrishna", "harekrishna", "harekrishna@gmail,com");
		Account a4=new Account("harekrishna", "harekrishna", "harekrishna@gmail,com");

		ArrayList<Account> account = new ArrayList<Account>();
		accounts.add(a1);accounts.add(a2);accounts.add(a3);accounts.add(a4);
		accountRepository.saveAll(accounts);
		
		System.out.println("saved");
		accountRepository.saveAll(accounts);
		System.out.println("saved");
		
		System.out.println("-----Total number of Accounts-----");
		System.out.println(accountRepository.count());
		
		System.out.println("-----All Accounts-----");
		accounts.forEach(s->System.out.println(s));
		
		
		
		//System.out.println("-----Find
		
		System.out.println("-----Find by name-----");
		List<Account> li=accountRepository.findByFname("HareKrishna");
		        for(Account s:l1) {
		    
		        	
		      
		       System.out.println(s);
		        }
		        
		
		        
		  System.out.println("-----Find by mail-----");
		  Account a=accountRepository.findByEmail("harekrishna@gmail.com");
		
		
	}
	
	
	

}
