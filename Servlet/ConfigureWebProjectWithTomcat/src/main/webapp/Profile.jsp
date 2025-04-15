<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP PostgreSQL DB Connection</title>
</head>
<body>

<h3>Database Output</h3>

<%
    // Database credentials
    String url = "jdbc:postgresql://localhost:9090/postgres";
    String username = "postgres";
    String password = "Abhishek@1";
    String query = "SELECT * FROM users";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(url, username, password);
        stmt = conn.createStatement();
        rs = stmt.executeQuery(query);

        while (rs.next()) {
%>
            <p>ID: <%= rs.getString(1) %></p>
            <p>NAME: <%= rs.getString(2) %></p>
            <p>AGE: <%= rs.getString(3) %></p>
            <hr>
<%
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        e.printStackTrace(); // logs to Tomcat console/logs
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
        if (stmt != null) try { stmt.close(); } catch (SQLException ignore) {}
        if (conn != null) try { conn.close(); } catch (SQLException ignore) {}
    }
%>

</body>
</html>
