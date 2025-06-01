package com.RestAPI.Learner.RestAPI.PeopleWithSQL_Consume;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Peoples {
	private String name;
	private int points;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Peoples [name=" + name + ", points=" + points + "]";
	}
	
}
