package SpringBoot.Product;

import java.util.ArrayList;

import org.springframework.stereotype.Component;


@Component
public class ProductService {

	ProductDB productdb = new ProductDB();
	
	
	
//	ArrayList<Product> products = new ArrayList<>();
//	
//	public void addProduct(Product product) {
//		// TODO Auto-generated method stub
//		productdb.addProduct(product);
//	}
//
//	public void getAllProducts() {
//		// TODO Auto-generated method stub
//		productdb.getAlldata();
//		
//	}
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
