package SpringBoot.Learn.model;

public class People {

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
		return "People [points=" + points + ", name=" + name + "]";
	}
	
	
	
}
