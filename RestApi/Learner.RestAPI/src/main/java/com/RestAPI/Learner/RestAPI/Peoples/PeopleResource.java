package com.RestAPI.Learner.RestAPI.Peoples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import com.RestAPI.Learner.RestAPI.PeopleRepository.PeoplesRepository;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import jakarta.ws.rs.Produces;

@Path("peoples")
public class PeopleResource {
	
	//for Single people
//	@GET
//	@Produces(jakarta.ws.rs.core.MediaType.APPLICATION_XML)
//	public Peoples getPeoples()
//	{
//		System.out.println("In Resource!");
//		Peoples p1 = new Peoples();
//		p1.setPoints(100);
//		p1.setName("Abhishek");
//		return p1;
//	}
	
	// for list of peoples
	/*
	@GET
	@Produces(jakarta.ws.rs.core.MediaType.APPLICATION_XML)
	public List<Peoples> getListPeoples()
	{
		System.out.println("In Resource!");
		Peoples p1 = new Peoples();
		p1.setPoints(100);
		p1.setName("Abhishek");
		
		Peoples p2 = new Peoples();
		p2.setPoints(100);
		p2.setName("Abhishek");
		
		List<Peoples> peoples = Arrays.asList(p1,p2);
		return peoples;
	}
	*/
	
	PeoplesRepository repo = new PeoplesRepository();
	
	@GET
	@Produces(jakarta.ws.rs.core.MediaType.APPLICATION_XML)
	public List<Peoples> getListPeoples()
	{
		System.out.println("In Resource!");
		
		
		
		return repo.getPeoples();
	}
	
	@GET
	@Path("{point}")
	@Produces(jakarta.ws.rs.core.MediaType.APPLICATION_XML)
	public Peoples getPeople(@PathParam("point") int point)
	{
		return repo.getPoeple(point);
		
	}
	
	@POST
	public Peoples createPeoples(Peoples ppl)
	{
		System.out.println("In CREATE!");
		System.out.println(ppl);
		repo.create(ppl);
		return ppl;
		
	}
	
}
