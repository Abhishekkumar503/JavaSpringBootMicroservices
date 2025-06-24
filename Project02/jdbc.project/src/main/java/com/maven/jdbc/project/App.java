package com.maven.jdbc.project;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
ProductService productService = new ProductService();
    	
//    	productService.addProduct(new Product("HP Pavellion", "Laptop", "Bed", "1"));
//    	productService.addProduct(new Product("HP Coding", "Laptop", "table", "2"));
//    	productService.addProduct(new Product("Asus", "Desktop", "black table", "3"));
//    	productService.addProduct(new Product("Realme Mobile", "Mobile", "Bed", "1"));
//    	productService.addProduct(new Product("Earbuds", "Accessories", "side table", "4"));
//    	productService.addProduct(new Product("headphone", "Accessories", "side table", "1"));
//    	productService.addProduct(new Product("Walllet", "Personal Accessories", "side table", "2"));
//    	productService.addProduct(new Product("Lighter", "Smoke Accessories", "Side Table", "1"));
//    	productService.addProduct(new Product("Tissue Paper", "Asscessories", "Side table", "1"));

    	
    	productService.getAllProducts();
    
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    	
    	productService.getOneProductByWarnty("1");
    	
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    	
    	productService.getProdcutByName("Realme Mobile"); // Make sure you have entered exact name
    	
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    	
    	productService.getProdcutByPlace("table"); // Make sure you have entered exact place
    	

    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    	
    	productService.getProdcutByText("e");
    	
    
    }
}
