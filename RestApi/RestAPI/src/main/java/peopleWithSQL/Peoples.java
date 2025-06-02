package peopleWithSQL;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "peoples")
@Entity
public class Peoples {
	private String name;
	@Id
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
