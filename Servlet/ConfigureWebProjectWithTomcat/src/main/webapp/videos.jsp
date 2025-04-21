<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
<%
//Hearcoded
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null && session.getAttribute("password")==null)
	response.sendRedirect("login.jsp");
%>

<h1>Welcome ${username} !!</h1>
<iframe width="560" height="315" src="https://www.youtube.com/embed/kclXuc_J50Y?si=ckXKTpSGcYdWvFt2" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>