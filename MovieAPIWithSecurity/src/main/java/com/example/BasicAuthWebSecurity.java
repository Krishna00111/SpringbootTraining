package com.example;
import org.springframework.context.annotation.Configuration; 
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;




import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class WebSecurity {
//	
//	
//	
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

@EnableWebSecurity
@Configuration
public class BasicAuthWebSecurityConfiguration{
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		
		http
		//Cross-site request forgery disabled
		.csrf().disable()
		
		
		//, authorizeRequests().anyRequest().authenticated()
		.authorizeRequests().antMatchers(HttpMethod.POST).authenticated()
		.and()
		.httpBasic();
		
		return http.build();

		 
		
		
		//in-memory authentication manager to validate
		
		//username and password,
		
		@Bean
		public InMemoryUsersDetailsManager userDetailsService()
		{
			UserDetails user= User
					.withUsername("steve")
					//NoOpPasswordEncoder
					.password("{noop}supersecret")
					.roles("USER")
					.build();
			return new InMemoryUserDetailsManager(user);
		}
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/**").permitAll();
	}
}
