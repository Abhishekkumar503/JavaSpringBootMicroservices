package SpringBoot.Product;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
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
	
	public Product(int id, String name, String type, String place, String warrenty) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
		this.warrenty = warrenty;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getPlace() {
//		return place;
//	}
//
//	public void setPlace(String place) {
//		this.place = place;
//	}
//
//	public String getWarrenty() {
//		return warrenty;
//	}
//
//	public void setWarrenty(String warrenty) {
//		this.warrenty = warrenty;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + ", warrenty=" + warrenty
//				+ "]";
//	}
	
	
}

/*
 * 
 1. Basic Annotations
Annotation	Description
@Getter	Generates getter methods for all fields
@Setter	Generates setter methods for all fields
@ToString	Generates toString() method
@EqualsAndHashCode	Generates equals() and hashCode() methods
@Data	Combines @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor
@Value	Immutable version of @Data (makes fields final)
 * 
 * 
 * 
 2. Constructor Annotations
Annotation	Description
@NoArgsConstructor	Generates a no-argument constructor
@AllArgsConstructor	Generates a constructor with all fields
@RequiredArgsConstructor	Constructor for final fields or fields with @NonNull
 */
 
