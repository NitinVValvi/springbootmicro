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
	var rollno = document.getElementById("rollno").value;
	var name = document.getElementById("name").value;
	var uname = document.getElementById("uname").value;
	var pass = document.getElementById("pass").value;
	var addr = document.getElementById("addr").value;

	alert(rollno);
	alert(name);
	alert(uname);
	alert(pass);
	alert(addr);
	

	var req = new XMLHttpRequest(); 
	var url = "http://localhost:9197/regconsumedata"
	req.open("POST",url,true);

	var student ={rollno:rollno,name:name,uname:uname,pass:pass,addr:addr}
	alert(student);

	var stu =JSON.stringify(student);
	req.setRequestHeader("Content-Type","application/json");
	req.send(stu);

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
			<th>RollNo</th>
			<td><input type="text" name="rollno" id="rollno">
		</tr>
			<tr>
			<th>Name</th>
			<td><input type="text" name="name" id="name">
		</tr>
			<tr>
			<th>UserName</th>
			<td><input type="text" name="uname" id="uname">
		</tr>
		
		<tr>
			<th>Password</th>
			<td><input type="text" name="pass" id="pass">
		</tr>
		<tr>
			<th>Address</th>
			<td><input type="text" name="addr" id="addr">
		</tr>
		<tr>
			<th></th>
			<td><input type="button" value="register" onclick="register()">
		</tr>
	</table>
</body>
</html>