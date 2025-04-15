<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
Hello World!
<%
String name1 = request.getAttribute("label").toString();
out.println("My name is "+name1);

%>
<p>My name is ${student}</p>
${student}
<%
Object labelObj = request.getAttribute("label");
if (labelObj != null) {
    String name = labelObj.toString();
    out.println("My name is " + name);
} else {
    out.println("Label attribute is missing.");
}
%>

</body>
</html>