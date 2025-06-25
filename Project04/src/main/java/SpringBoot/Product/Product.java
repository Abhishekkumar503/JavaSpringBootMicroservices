package SpringBoot.Product;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name ;
	private String type ;
	private String place;
	private String warrenty;
	
	public Product()
	{
		
	}
	
	public Product(int i, String name, String type, String place, String warrenty) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
		this.warrenty = warrenty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + ", warrenty=" + warrenty
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
