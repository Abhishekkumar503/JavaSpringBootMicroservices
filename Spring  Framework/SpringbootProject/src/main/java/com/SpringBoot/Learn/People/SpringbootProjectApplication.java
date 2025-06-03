package com.SpringBoot.Learn.People;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootProjectApplication.class, args);
		
		Peoples obj = context.getBean(Peoples.class);
		
		obj.Code();
	}


}
