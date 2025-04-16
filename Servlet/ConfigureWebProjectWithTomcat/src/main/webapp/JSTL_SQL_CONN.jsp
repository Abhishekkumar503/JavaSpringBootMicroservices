<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Tutorial SQL Tags</title>
</head>
<body>
<sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:9090/postgres" user="postgres" password="Abhishek@1"/>
<sql:query var="rs" dataSource="${db}">SELECT * FROM users</sql:query>
<c:forEach items="${rs.rows}" var="gdt">
<br><c:out value="${gdt.id}"> : </c:out><c:out value="${gdt.name}"> : </c:out><c:out value="${gdt.age}"></c:out>
</c:forEach>
</body>
</html>
