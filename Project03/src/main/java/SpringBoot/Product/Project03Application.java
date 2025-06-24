package SpringBoot.Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project03Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Project03Application.class, args);
		
		ProductService service = context.getBean(ProductService.class);
	}

}
