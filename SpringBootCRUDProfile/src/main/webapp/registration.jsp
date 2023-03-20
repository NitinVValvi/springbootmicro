<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cjc.register.com</title>
<style >
h1{color: red}
th{color: olive}
body{background-image: url("bgimg.png");}
</style>
</head>
<body>
<h1 align ="center"> Register Data</h1>
	<form action = "reg">
		<table align= "center">
		<tr>
		<th>Name</th>
		<td><input type = "text" name = "name"></td>
		</tr>
		<tr>
		<th>Username</th>
		<td><input type = "text" name = "username"></td>
		</tr>
		<tr>
		<th>Password</th>
		<td><input type = "text" name = "password"></td>
		</tr>
		<tr>
		<th>MobileNO</th>
		<td><input type = "text" name = "mobno"></td>
		</tr>
		<tr>
		<th>City</th>
		<td><input type = "text" name = "city"></td>
		</tr>
		<tr>
		<th></th>
		<td><input type = "submit" value = "Save"></td>
		</tr>
		</table>
	
	</form>
</body>
</html>