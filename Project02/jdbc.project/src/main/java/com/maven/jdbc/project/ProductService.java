package com.maven.jdbc.project;

import java.util.ArrayList;



public class ProductService {

	ProductDB productdb = new ProductDB();
	ArrayList<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productdb.addProduct(product);
	}

	public void getAllProducts() {
		// TODO Auto-generated method stub
		productdb.getAlldata();
//		for(Product product : products)
//		{
//			System.out.println(product);
//		}
	}

//	public void getOneProductByWarnty(int i) {
//		// TODO Auto-generated method stub
//				for(Product product : products)
//				{
//					if(product.getWarrenty() == i)
//					System.out.println(product);
//				}
//	}

	public void getProdcutByName(String name) {
		// TODO Auto-generated method stub
		for(Product product : products)
		{
			if(product.getName() == name)
			System.out.println(product);
		}
	}
	
	public void getProdcutByPlace(String place) {
		// TODO Auto-generated method stub
		for(Product product : products)
		{
			if(product.getPlace().equals(place))
			System.out.println(product);
		}
	}

	public void getProdcutByText(String text) {
		// TODO Auto-generated method stub
		for(Product product : products)
		{
			if(product.getPlace().contains(text) || product.getType().contains(text) || product.getName().contains(text))
			System.out.println(product);
		}
	}
}
