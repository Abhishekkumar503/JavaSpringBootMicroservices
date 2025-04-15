package com.learner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBCConnection {
    public static void main(String[] args) {
        // Database Credentials
        String url = "jdbc:postgresql://localhost:9090/postgres";  // Usually PostgreSQL uses port 5432
        String username = "postgres";
        String password = "Abhishek@1";  // Replace with your actual password

        // Load PostgreSQL Driver and Check Connection
        try {
            Class.forName("org.postgresql.Driver"); // Ensure the driver is available in classpath
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                if (conn != null) {
                    System.out.println("✅ Connection Successful!");
                } else {
                    System.out.println("❌ Connection Failed!");
                }
            } catch (SQLException e) {
                System.out.println("❌ SQL Exception: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}
