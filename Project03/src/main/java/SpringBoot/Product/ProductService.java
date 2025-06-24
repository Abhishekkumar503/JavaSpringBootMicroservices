package SpringBoot.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductService {

	@Autowired
	ProductDB productdb ;
	
	
//	ArrayList<Product> products = new ArrayList<>();
//	
//	public void addProduct(Product product) {
//		// TODO Auto-generated method stub
//		productdb.addProduct(product);
//	}
//
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productdb.findAll();
		
	}
//
//	public void getOneProductByWarnty(String i) {
//		// TODO Auto-generated method stub
//		productdb.fetchDataByWarrenty(i);
//					
//	}
//
//	public void getProdcutByName(String name) {
//		// TODO Auto-generated method stub
//		productdb.fetchDataByName(name);
//	}
//	
//	public void getProdcutByPlace(String place) {
//		// TODO Auto-generated method stub
//		productdb.fetchDataByPlace(place);
//	}
//
//	public void getProdcutByText(String text) {
//		// TODO Auto-generated method stub
//		for(Product product : products)
//		{
//			if(product.getPlace().contains(text) || product.getType().contains(text) || product.getName().contains(text))
//			System.out.println(product);
//		}
//		productdb.fetchDataByText(text);
//	}
}
