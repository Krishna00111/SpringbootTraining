package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//
//
@RestController
public class AccountController {
	
	
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping("/accounts")
	public Iterable<Account> getAllAccounts(){
		return accountRepository.findAll();
	}
	
	
	@RequestMapping("/accounts/{id}")
	public Account getAccountById(@PathVariable("id")Long id) {
		Optional<Account>a1=accountRepository.findById(id);
		return a1.get();
	}
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
	
	//
	
	//request can be sent through postman or index.html
	@RequestMapping(value="/addForm", method=RequestMethod.POST)
	public String addAccount{@ModelAttribute("fname") String fname,@ModelAttribute("lname")String lname,
		    @ModelAttribute("emai") String email) {
		 Account a = new Account(fname, lname, email);
		 accountRepository.save(a);
		 return "<html><body bgcolor='coral'>Added Account Successfully<br><a href='/accounts'>View All Accounts</a>"
				 
		    }
		    
	//through postman send request
    @PostMapping(value="/addObject")
    public ResponseEntity<?> addAccount(@RequestBody Account acc) {
    	accountRepository.save(acc);
    	return new ResponseEntity<>(acc.getId().toString(), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    //@ResponseBody
    public String deleteEmployee(@PathVariable("id")Long id) {
    	accountRepository.deleteById(id);
    	return "Deleted Successfully";
    }
	}
	
}

