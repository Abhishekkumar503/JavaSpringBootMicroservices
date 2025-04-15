<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
Hello World!
<%
String name = request.getAttribute("label").toString();
out.println("My name is "+name);

%>
<p>My name is ${label}</p>

${label}
</body>
</html>