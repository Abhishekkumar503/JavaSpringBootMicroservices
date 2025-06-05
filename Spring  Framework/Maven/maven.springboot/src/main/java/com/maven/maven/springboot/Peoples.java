package com.maven.maven.springboot;


import org.springframework.stereotype.Component;

@Component
public class Peoples {
	private int points = 200;
	private String name;
	private Computer computer;
	
	
	
//	public Peoples(int points) {
//		this.points = points;
//	}
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
	
	
	public Peoples() {
		System.out.println(" You're in Constructor !!");
	}
	public void Code()
	{
		System.out.println("In Code method!");
		computer.Compile();
	}
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	
	
	
	
}
