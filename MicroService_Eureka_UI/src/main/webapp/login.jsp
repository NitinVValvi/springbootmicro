<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login.com</title>
</head>
<script type="text/javascript">
function login() {
	alert("Hello Login")
	var un = document.getElementById("uname").value;
	var ps = document.getElementById("pass").value;
	alert(un);
	alert(ps);

	var req = new XMLHttpRequest(); 
	var url = "http://localhost:8080/con/getconsumedata/"+un+"/"+ps+"";
	req.open("GET",url,true);
	req.send();
	alert("Success");	

	req.onreadystatechange = function()
	{
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
	<h1 align="center">Login Page</h1>
	<br>
	<br>

	<table align="center">
		<tr>
			<th>UserName</th>
			<td><input type="text" name="un" id="uname">
		</tr>
		<tr>
			<th>Password</th>
			<td><input type="text" name="ps" id="pass">
		</tr>
		<tr>
			<th></th>
			<td><input type="button" value="login" onclick="login()">
		</tr>
	</table>
</body>
</html>