package SpringBoot.Learn.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class People {

	@Id
	private int points;
	private String name;
	
	
	
	public People() {
	
	}
	public People(int points, String name) {
		super();
		this.points = points;
		this.name = name;
	}
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
		return "People [points=" + points + ", name=" + name + "]";
	}
	
	
	
}
