<%@ page language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>


<c:forEach items = "${students}" var = "s">
${s} <br>
</c:forEach>

<!-- Now to connect with database with taglib -->
<s

</body>
</html>