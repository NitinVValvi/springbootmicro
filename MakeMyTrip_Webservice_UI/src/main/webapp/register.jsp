<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login.com</title>
</head>
<script type="text/javascript">
function register() {
	alert("Hello Register")
	var cid = document.getElementById("cid").value;
	var name = document.getElementById("name").value;
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var email = document.getElementById("email").value;

	alert(cid);
	alert(name);
	alert(username);
	alert(password);
	alert(email);
	

	var req = new XMLHttpRequest(); 
	var url = "http://localhost:9797/regcustomerdata";
	req.open("POST",url,true);
	
	var customer ={cid:cid,name:name,username:username,password:password,email:email}
	alert(customer);

	var cus =JSON.stringify(customer);
	req.setRequestHeader("Content-Type","application/json");
	req.send(cus);

	alert("Success");	
	

	req.onreadystatechange = function()
	{
		alert(req.readyState);
		if(req.readyState==4 && req.status==200)
			{

				alert(req.responseText);
				
	
			}

	}
	
}

</script>
<body>
	<br>
	<br>
	<h1 align="center">Register</h1>
	<br>
	<br>
<form action="register">
	<table align="center">
		<tr>
			<th>CustomerID</th>
			<td><input type="text" name="cid" id="cid">
		</tr>
			<tr>
			<th>Name</th>
			<td><input type="text" name="name" id="name">
		</tr>
			<tr>
			<th>UserName</th>
			<td><input type="text" name="username" id="username">
		</tr>
		
		<tr>
			<th>Password</th>
			<td><input type="text" name="password" id="password">
		</tr>
		<tr>
			<th>Email ID</th>
			<td><input type="text" name="email" id="email">
		</tr>
		<tr>
			<th></th>
			<td><input type="button" value="register" onclick="register()">
		</tr>
	</table>
	</form>
</body>
</html>