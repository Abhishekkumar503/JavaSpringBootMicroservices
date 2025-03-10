<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor= 'yellow'>
<%
int sum = Integer.parseInt(request.getParameter("Num1")) + Integer.parseInt(request.getParameter("Num2")) ;
out.print("Sum is : "+ sum );
%>
</body>
</html>