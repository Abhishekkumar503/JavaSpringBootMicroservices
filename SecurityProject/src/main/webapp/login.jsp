<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login</h2>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
    <c:if test="${param.error != null}">
        <p style="color:red;">Invalid username or password</p>
    </c:if>
    <c:if test="${param.logout != null}">
        <p style="color:green;">You have been logged out</p>
    </c:if>

    <form method="post" action="${pageContext.request.contextPath}/login">
        <label>Username:</label>
        <input type="text" name="username" /><br/><br/>
        <label>Password:</label>
        <input type="password" name="password" /><br/><br/>
        <input type="submit" value="Login" />
    </form>
</body>
</html>
