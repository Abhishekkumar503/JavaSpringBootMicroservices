<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us</title>
</head>
<body>
<%
if(session.getAttribute("username")==null && session.getAttribute("password")==null)
	response.sendRedirect("login.jsp");
%>
<h1>This is Abhishek.</h1>
<h2>Java Leaner </h2>
</body>
</html>