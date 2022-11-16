package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAutowireDependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAutowireDependencyInjectionApplication.class, args);
		
		Alien a = new Alien();
		
	}

}
