<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Tutorial Function Tags</title>
</head>
<body>
<c:set var="str" value="My name is Abhishek"></c:set>
Length : ${fn:length(str)}
<c:forEach items="${fn:split(str,' ')}" var="s">
<br>
${s}
</c:forEach>
<br>
index : ${fn:indexOf(str,"is")}
<br>
is there : ${fn:contains(str,"java")}
<br>
<c:if test="${fn:contains(str,'Abhishek')}"> Abhishek is available</c:if>
<br>
<c:if test="${fn:endsWith(str,'Abhishek')}"> YES, Ending with Abhishek</c:if>
<br>
${fn:toUpperCase(str)}
<br>
${fn:toLowerCase(str)}
</body>
</html>