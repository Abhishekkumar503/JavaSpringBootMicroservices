package com.SpringBoot.Learn.PeopleWithLaptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Peoples {
	private int points;
	private String name;
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Peoples [points=" + points + ", name=" + name + "]";
	}
	
	@Autowired
	Laptop laptop;	

	public void Code()
	{
		laptop.laptopName();
		System.out.println("In Code method!");
	}
}
