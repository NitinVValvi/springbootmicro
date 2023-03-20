<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cjc.com</title>
<style>
h1{
color:red;
}
th{color: olive}
</style>
</head>
<body>

<h1 align="center">Login Page</h1>
	<form action="log" >
		<table align ="center">
			<tr>
				<th>Username</th>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<th><input type="submit" value="Login"></th>
				<td><a href="reg">New User?</a></td>
			</tr>
		</table>


	</form>
</body>
</html>