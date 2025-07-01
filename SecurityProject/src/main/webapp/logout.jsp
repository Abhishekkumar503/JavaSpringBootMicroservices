<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h2>Welcome, ${pageContext.request.userPrincipal.name}!</h2>
    <p>You are logged in.</p>
    <form action="<c:url value='/logout'/>" method="post">
        <input type="submit" value="Logout"/>
    </form>
    </body>
</html>
