package com.example.SpringBootJPADemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Configuration
public class ThymeleafConfig {
	

   @Bean
   public SpringResourceTemplateResolver templateResolver1() {
	   SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver;
	   //templateResolver.setCacheable(false);
	   templateResolver.setPrefix("classpath:/newdir/");
	   templateResolver.setSuffix(".html");
	   //setOrder required to mention the order of the view engines, when using
	   //templateResolver.setOrder(1);
	   templateResolver.setCheckExistence(true);
	   return templateResolver;
	   }
   @Bean
   public SpringResourceTemplateResolver templateResolver2() {
	   SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver;
	   //templateResolver.setCacheable(false);
	   templateResolver.setPrefix("classpath:/newDir2/");
	   templateResolver.setSuffix(".htm");
	   //setOrder required to mention the order of the view engines, when using
	   //templateResolver.setOrder(1);
	   templateResolver.setCheckExistence(true);
	   return templateResolver;
	   }
   
   @Bean
   public SpringTemplateEngine templateEngine() {
	   SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
	   springTemplateEngine.addTemplateResolver(templateResolver1());
	   springTemplateEngine.addTemplateResolver(templateResolver2());
	   return springTemplateEngine;
   }
   
   @Bean
   public ThymeleafviewResolver viewResolver() {
	   ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	   viewResolver.setTemplateEngine();
	   //viewResolver.setOrder(1);
	   return viewResolver;
   }
}
