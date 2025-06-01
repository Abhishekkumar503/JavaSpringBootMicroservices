package com.RestAPI.Learner.RestAPI.PUT_Method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("peopleWithPUT")
public class PeopleResource {
	
	
	PeoplesRepository repo = new PeoplesRepository();

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Peoples> getListPeoples()
	{
		System.out.println("In Resource!");
		return repo.getPeoples();
//		
	}
	
	@GET
	@Path("{point}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
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
	
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Peoples updatePeoples(Peoples ppl)
	{
		System.out.println("In Update!");
		if(repo.getPoeple(ppl.getPoints()).getPoints() == 0)
			repo.create(ppl);
		else
			repo.Update(ppl);
		return ppl;
		
	}
	
	
}
