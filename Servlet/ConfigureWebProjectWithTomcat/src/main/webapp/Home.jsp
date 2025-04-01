<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<%! // Declaration block (Use only for variables and methods)
    int coef = 69; 
%>

<h1>Hello World!</h1>

<%  // Scriptlet (For dynamic content)
    out.println("Sum: " + (10 + 56)); 
%>
	My Fav number is : <%= coef %> //Expression
</body>
</html>
