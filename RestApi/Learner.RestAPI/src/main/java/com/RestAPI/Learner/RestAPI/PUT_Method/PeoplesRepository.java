package com.RestAPI.Learner.RestAPI.PUT_Method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.RestAPI.Learner.RestAPI.PeopleWithSQL_Consume.*;

public class PeoplesRepository {

	List<Peoples> people;
	Connection con;
	
	//CONSTRUCTOR
	public PeoplesRepository() {
		System.out.println("In Constructor!");
		
		String url= "jdbc:mysql://localhost:3306/RestAPI";
        String userName="root";
        String passWord="Abhishek@1";
        // Class for name
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establishing a connection
	         con= DriverManager.getConnection(url,userName,passWord);
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

	public List<Peoples> getPeoples() {
		List<Peoples> people = new ArrayList<>();
		 String query = "Select * from People";
		 
	        Statement st;
			try {
				//Creating the statement
				st = con.createStatement();
				ResultSet rs=st.executeQuery(query);
				while(rs.next())
				{
					Peoples ppl = new Peoples();
					ppl.setPoints(rs.getInt(1));
					ppl.setName(rs.getString(2));
					people.add(ppl);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
		return people;
	}
	
	public Peoples getPoeple(int point)
	{
		System.out.println(" In getPoepleRepo!");
		String query = "Select * from People where points =" +point;
        Statement st;
        Peoples ppl = new Peoples();
		try {
			//Creating the statement
			st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{
				ppl.setPoints(rs.getInt(1));
				ppl.setName(rs.getString(2));
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return ppl;
		
	}

	public void create(Peoples ppl) {
		// TODO Auto-generated method stub
		System.out.println("In CreateRepo!");
		String query = "INSERT INTO People VALUES (?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, ppl.getPoints());
			st.setString(2, ppl.getName());
			st.executeUpdate();
	        System.out.println("Row/s Inserted!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void Update(Peoples ppl) {
		// TODO Auto-generated method stub
		System.out.println("In UpdateRepo!");
		String query = "update People set name = ? where points = ?";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(2, ppl.getPoints());
			st.setString(1, ppl.getName());
			st.executeUpdate();
	        System.out.println("Row/s Updated!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}
