package SpringBoot.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDB extends JpaRepository<Product, Integer>{

	
}
