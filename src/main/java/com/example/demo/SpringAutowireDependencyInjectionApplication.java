package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAutowireDependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringAutowireDependencyInjectionApplication.class, args);  //initialize container
		
		Alien a = context.getBean(Alien.class);
		
		a.show();
		
//		Alien a1 = context.getBean(Alien.class);       //in total there will be only one object created
//		
//		a1.show();
		
	}

}
