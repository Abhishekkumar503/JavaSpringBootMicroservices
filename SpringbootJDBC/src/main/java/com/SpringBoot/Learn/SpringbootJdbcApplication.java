package com.SpringBoot.Learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.Learn.model.People;
import com.SpringBoot.Learn.repo.PeopleRepo;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringbootJdbcApplication.class, args);
		People ppl =context.getBean(People.class);
		ppl.setId(104);
		ppl.setName("Vijay");
		ppl.setTech("HR");
		
		PeopleRepo repo = context.getBean(PeopleRepo.class);
		repo.save(ppl);
		
		System.out.println(repo.findAll1());
		System.out.println(repo.findAll2());
		System.out.println(repo.findAll3());
		System.out.println(repo.findAll4());
	}

}
