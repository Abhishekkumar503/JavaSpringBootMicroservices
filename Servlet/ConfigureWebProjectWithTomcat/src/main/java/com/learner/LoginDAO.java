package com.learner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	// Database credentials
    String url = "jdbc:postgresql://localhost:9090/postgres";
    String username = "postgres";
    String password = "Abhishek@1";
    String query = "SELECT * FROM login where username = ? and password = ?";

    public boolean check(String uname , String pass) {	

    try {
        Class.forName("org.postgresql.Driver");
        Connection conn  = DriverManager.getConnection(url, username, password);
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, uname);
        st.setString(2, pass);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
			return true;
		}

    } catch (Exception e) {
        System.out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        e.printStackTrace(); // logs to Tomcat console/logs
    }
	return false; 
    }
}
	

