<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC </title>
</head>
<body>
<h1>Welcome to Spring MVC</h1>
<form action="viewAll" method="get">
<h2>Do you want to see all data ? IF yes click below button.</h2>
<input type="Submit">
</form>
<br>
----------------------------------------------------------------------------------------------
<br>
<form action="getPeople" method="get">
<h2>Do you want to display single person with Points? then </h2>
Enter your point : <input type="text" name="onePoint"><br>
<input type="Submit">
</form>
<br>
----------------------------------------------------------------------------------------------
<br>
<form action="getPeopleByName" method="get">
<h2>Do you want to display single person with Name? then </h2>
Enter your point : <input type="text" name="oneName"><br>
<input type="Submit">
</form>
<br>
----------------------------------------------------------------------------------------------
<br>
<form action="addPeople" method="get">
<h2>Do you want to add new people? If yes then submit below details.</h2>
Enter your point : <input type="text" name="points"><br>
Enter your name : <input type="text" name="name"><br>
<input type="Submit">
</form>
</body>
</html>