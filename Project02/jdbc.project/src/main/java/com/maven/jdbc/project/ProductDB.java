package com.maven.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDB {

	Connection con;
	Statement st;
	ResultSet rs;
	public ProductDB() {
		
        String url = "jdbc:mysql://localhost:3306/RestAPI";
        String userName = "root";
        String passWord = "Abhishek@1";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url, userName, passWord);
			  st = con.createStatement();
			  System.out.println("Connected!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	
	public void addProduct(Product product)
	{
		String query = "INSERT INTO Product (name,type,place,warrenty) VALUES (?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);			
			st.setString(4, product.getWarrenty());
			st.setString(1, product.getName());
			st.setString(3,product.getPlace());
			st.setString(2,product.getType());
			st.executeUpdate();
	        System.out.println("Row/s Inserted!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void getAlldata() {
		// TODO Auto-generated method stub
		 String query="select * from Product";
		try {
			rs=st.executeQuery(query);
			 // to incremnet the pointer use
	        while(rs.next()) {
	            rs.next();
	            String userData = rs.getInt(1) + " : " + rs.getString(2)+ " : " + rs.getString(3)+ " : " + rs.getString(4)+ " : " + rs.getString(5);
	            System.out.println(userData);
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       

	}
	
	

	
}
