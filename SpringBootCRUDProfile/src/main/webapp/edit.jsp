<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style >
h1{color: red}
th{color: olive}
body{background-image: url("bgimg.png");}
</style>
<h1 align="center">EDIT DATA</h1>

</head>

<body>
<form action="update">
<table  align ="center">

<input type="hidden" name="uid" value="${data.uid}">

<tr>
<td>Name</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>User Name</td>
<td><input type="text" name="username" value="${data.username}"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password" value="${data.password}"></td>
</tr>
<tr>
<td>Mobile No</td>
<td><input type="text" name="mobno" value="${data.mobno}"></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city" value="${data.city}"></td>
</tr>
<tr>
<th></th>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>