<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Database Connection Example By JSP</title>
</head>
<body>

15<br>
Abhishek <br>
TCS <br>

<%
    // Database credentials
    String url = "jdbc:postgresql://localhost:9090/postgres"; // Fixed port to 5432
    String username = "postgres";
    String password = "0";  // Avoid hardcoding passwords in production!
    String query = "SELECT * FROM users";
    
    Connection db = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        Class.forName("org.postgresql.Driver");  // Load PostgreSQL Driver
        db = DriverManager.getConnection(url, username, password);
        st = db.createStatement();
        rs = st.executeQuery(query);

        if (rs.next()) {  // Check if there is at least one row
%>
        <p>ID : <%= rs.getString(1) %></p>
        <p>NAME : <%= rs.getString(2) %></p>
        <p>AGE : <%= rs.getString(3) %></p>
<%
        } else {
            out.println("<p style='color:red;'>No records found.</p>");
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Database Connection Failed: " + e.getMessage() + "</p>");
    } finally {
        // Close database resources to avoid memory leaks
        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
        if (st != null) try { st.close(); } catch (SQLException ignore) {}
        if (db != null) try { db.close(); } catch (SQLException ignore) {}
    }
%>

</body>
</html>
