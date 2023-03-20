<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<style>
h1{
color:red;
}
th{color: olive}
</style>
</head>
<body>
	<h1 align = "center">Welcome CJC</h1>
	<form border="1">
<table border="1" align="center">
			<th>Id</th>
			<th>Name</th>
			<th>User Name</th>
			<th>Password</th>
			<th>Mobile No</th>
			<th>City</th>
			<tr>
				
					<br>
					<td>${data.sid}</td>
					<td>${data.sname}</td>
					<td>${data.username}</td>
					<td>${data.password}</td>
					<td>${data.mobno}</td>
					<td>${data.city }</td>
			</tr>
			

		</table>
	</form>
<%-- 	${data.sname}
	${data.username}
	${data.password}
	${data.mobno}
	${data.city} --%>
</body>
</html>