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
if(session.getAttribute("username")==null && session.getAttribute("password")==null)
	response.sendRedirect("login.jsp");
%>

<h1>Welcome ${username} !!</h1>
<video src="C:\Users\Abh!shek\Desktop\New folder (3)\Whiskey_Di_Botal (Official_Video)__Preet_Hundal__Jasmine_Sandlas__Latest_Songs_2018(2K).webm"></video>
</body>
</html>