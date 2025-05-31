package com.RestAPI.Learner.RestAPI.PeopleRepository;

import java.util.ArrayList;
import java.util.List;

import com.RestAPI.Learner.RestAPI.Peoples.Peoples;

public class PeoplesRepository {

	List<Peoples> people;

	public PeoplesRepository() {
		people = new ArrayList<>();
		
		System.out.println("In Repository!");
		Peoples p1 = new Peoples();
		p1.setPoints(100);
		p1.setName("Abhishek");
		
		Peoples p2 = new Peoples();
		p2.setPoints(101);
		p2.setName("Udai");
		
		people.add(p1);
		people.add(p2);
		
	}

	public List<Peoples> getPeoples() {
		return people;
	}
	
	public Peoples getPoeple(int point)
	{
		System.out.println(" In getPoeple!");
		for(Peoples ppl : people)
			if(ppl.getPoints()==point)
				return ppl;
		return null;
		
	}

	public void create(Peoples ppl) {
		// TODO Auto-generated method stub
		people.add(ppl);
	}
	
}
