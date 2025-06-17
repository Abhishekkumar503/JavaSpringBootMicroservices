package com.maven.learn.project;

import java.util.ArrayList;


public class ProductService {

	ArrayList<Product> products = new ArrayList<>();

//	public void addProduct(Product product) {
//		// TODO Auto-generated method stub
//		products.add(product);
//	}
//
//	public void getAllProducts() {
//		// TODO Auto-generated method stub
//		for(Product product : products)
//		{
//			System.out.println(product);
//		}
//	}
//
//	public void getOneProductByWarnty(int i) {
//		// TODO Auto-generated method stub
//				for(Product product : products)
//				{
//					if(product.getWarrenty() == i)
//					System.out.println(product);
//				}
//	}
//
//	public void getProdcutByName(String name) {
//		// TODO Auto-generated method stub
//		for(Product product : products)
//		{
//			if(product.getName() == name)
//			System.out.println(product);
//		}
//	}
//	
//	public void getProdcutByPlace(String place) {
//		// TODO Auto-generated method stub
//		for(Product product : products)
//		{
//			if(product.getPlace().equals(place))
//			System.out.println(product);
//		}
//	}
//
//	public void getProdcutByText(String text) {
//		// TODO Auto-generated method stub
//		for(Product product : products)
//		{
//			if(product.getPlace().contains(text) || product.getType().contains(text) || product.getName().contains(text))
//			System.out.println(product);
//		}
//	}
	
	// *********************************** Streams *******************************************


	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    public void getAllProducts() {
	        products.stream()
	                .forEach(System.out::println);
	    }

	    public void getOneProductByWarnty(int warranty) {
	        products.stream()
	                .filter(p -> p.getWarrenty() == warranty)
	                .forEach(System.out::println);
	    }

	    public void getProdcutByName(String name) {
	        products.stream()
	                .filter(p -> p.getName().equals(name)) // NOTE: use equals for String comparison
	                .forEach(System.out::println);
	    }

	    public void getProdcutByPlace(String place) {
	        products.stream()
	                .filter(p -> p.getPlace().equals(place))
	                .forEach(System.out::println);
	    }

	    public void getProdcutByText(String text) {
	        products.stream()
	                .filter(p -> p.getPlace().contains(text) || 
	                             p.getType().contains(text) || 
	                             p.getName().contains(text))
	                .forEach(System.out::println);
	    }
	

	
}
