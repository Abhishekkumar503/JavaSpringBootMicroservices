<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to  Online Site</title>
</head>
<body>
<%
if(session.getAttribute("username")==null && session.getAttribute("password")==null)
	response.sendRedirect("login.jsp");
%>
<h1>Welcome ${username} </h1>
<h1>Now You're able to login and navigate to welcome Page... :-) </h1>

<h2>Do you want to see video ? If yes then  </h2>
<a href="videos.jsp">Click here!</a>


<h3>Do you want to logout? </h3>
<h4>If yes then Click Here!</h4>
<form action="logout">
<input type="Submit" value="Logout">
</form>
</body>
</html>