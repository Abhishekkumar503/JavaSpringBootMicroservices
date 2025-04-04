package com.learner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBCConnection {
    public static void main(String[] args) {
        // Database Credentials
        String url = "jdbc:postgresql://localhost:9090/sampledb";  // Change port if needed
        String username = "postgres";
        String password = "SCRAM-SHA-256$4096:CG5l1hEjHjhBcoGLBdHMDQ==$KrAY9TXenNl4PHDyBSZObdUlRZfw3XN5UltZvEQvnNE=:doSpG4lftBi9q/Y+Vcu2QdquX6BWYigYRT3LZyR/dU4=";  // Replace with your actual password

        // Check Connection
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            if (conn != null) {
                System.out.println("✅ Connection Successful!");
            } else {
                System.out.println("❌ Connection Failed!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Connection Failed! Error: " + e.getMessage());
        }
    }
}
