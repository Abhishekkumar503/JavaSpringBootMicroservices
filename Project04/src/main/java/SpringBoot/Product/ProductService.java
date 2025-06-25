package SpringBoot.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductService {

	@Autowired
	ProductDB productdb ;
	
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productdb.save(product);
		System.out.println("Product Added!");
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productdb.findAll();
		
	}

	public List<Product> getProductByWarnty(String i) {
		// TODO Auto-generated method stub
		return productdb.findByWarrenty(i);			
	}

	public List<Product> getProdcutByName(String name) {
		// TODO Auto-generated method stub
		return productdb.findByName(name);
	}
	
	public List<Product> getProdcutByPlace(String place) {
		// TODO Auto-generated method stub
		return productdb.findByPlace(place);
	}

	public List<Product> getProdcutByText(String text) {
		// TODO Auto-generated method stub
		return productdb.find(text);
	}
	
	public Product getProductByID(int id) {
		// TODO Auto-generated method stub
		return productdb.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
	}

	public List<Product> getProdcutByType(String type) {
		// TODO Auto-generated method stub
		return productdb.findByType(type);
	}
}
