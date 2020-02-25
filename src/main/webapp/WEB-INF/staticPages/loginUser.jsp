<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<h4>LOGIN</h4>
</center>
<body>

<form action="login" method="POST">

<table align="center" >
 <h1> ${result}</h1>
<tr>
<td><label for="name"><b>USERNAME</b></label></td>
<td><input type="text"  name=userName  placeholder="Enter Name" ></td>
</tr>

<tr>
<td><label for="password"><b>PASSWORD</b></label></td>
<td><input type="password"  name=userPasword  placeholder="Enter Password" ></td>
</tr>
<center>
<tr>

<td><input type="submit" value="LOGIN" ></td>
</tr>
</center>
</table>
</form>
</body>
</html>