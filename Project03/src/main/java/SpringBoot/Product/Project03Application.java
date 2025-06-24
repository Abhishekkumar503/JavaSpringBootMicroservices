package SpringBoot.Product;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project03Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Project03Application.class, args);
		
		ProductService service = context.getBean(ProductService.class);
		
//		service.addProduct(new Product(15,"Lighter", "Smoke Accessories", "Side Table", "11"));
		
System.out.println("*************************** /n ***********************************");
		
		List<Product> p = service.getAllProducts();
			for(Product pt : p)
				System.out.println(pt);
			
System.out.println("*************************** /n ***********************************");
			
			List<Product> wrnty = service.getProductByWarnty("1");
			for(Product pt : wrnty)
				System.out.println(pt);
			
System.out.println("*************************** /n ***********************************");
			
			List<Product> name = service.getProdcutByName("Asus");
			for(Product pt : name)
				System.out.println(pt);
System.out.println("*************************** /n ***********************************");
			
			List<Product> place = service.getProdcutByPlace("Table");
			for(Product pt : place)
				System.out.println(pt);
			
System.out.println("*************************** /n ***********************************");
			
			List<Product> text = service.getProdcutByText("Real");
			for(Product pt : text)
				System.out.println(pt);
			
System.out.println("*************************** /n ***********************************");
			
				System.out.println(service.getProductByID(2));
		
	}

}
