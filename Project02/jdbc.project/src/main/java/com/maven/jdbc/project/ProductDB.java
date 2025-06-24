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
	String userData;
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
	
	public void displayProduct(ResultSet rs)
	{
		try {
			userData = rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3)+ " : " + rs.getString(4) + " : " + rs.getString(5);
			 System.out.println(userData);
		} catch (SQLException e) {
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
			 
	        while(rs.next()) {
	        	displayProduct(rs);
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	public void fetchDataByWarrenty(String i) {
		// TODO Auto-generated method stub
		String query = "Select * from product where Warrenty = " + i;
		try {
			rs=st.executeQuery(query);
			while (rs.next()) {
			displayProduct(rs);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchDataByName(String name) {
		// TODO Auto-generated method stub
		String query = "Select * from product where Name = '" + name +"'";
		try {
			rs=st.executeQuery(query);
			while (rs.next()) {
			displayProduct(rs);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchDataByPlace(String place) {
		// TODO Auto-generated method stub
		String query = "Select * from product where Place = '" + place +"'";
		try {
			rs=st.executeQuery(query);
			while (rs.next()) {
			displayProduct(rs);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchDataByText(String text) {
		// TODO Auto-generated method stub
		String query = "Select * from product where Name like '%"+ text + "%' or Place like '%"+ text +
				"%'  or type like '%"+ text + "%' or warrenty like '%"+ text + "%'";
		try {
			rs=st.executeQuery(query);
			while (rs.next()) {
			displayProduct(rs);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
}
