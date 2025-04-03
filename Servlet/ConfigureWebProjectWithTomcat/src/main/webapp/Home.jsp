<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
    <%@ include file="Header.jsp"%>
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
	
	<% pageContext.setAttribute("name", "Abhishek",pageContext.SESSION_SCOPE);
	
	config.getInitParameter("o");%>
	
	<!--  <% try 
	{
		int num=1/0; 
	}
	catch(Exception e)
	{
		out.println("Error : "+ e.getMessage());
	}
	%> -->
	
	<% int num=1/0; %>
	
	<!-- Commenting Sysntax -->
	
</body>
</html>

