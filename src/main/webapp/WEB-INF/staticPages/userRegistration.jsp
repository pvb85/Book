<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerUser" method="POST"> 
<div class="container">

<table align="center">
<h4 align="center">
CUSTOMER REGISTRATION
</h4>


<tr>
<td><label for="name"><b>NAME</b></label></td>
<td><input type="text" placeholder="Enter Name" name=userName ></td>
</tr>

<td><label for="password"><b>PASSWORD</b></label></td>
<td><input type="password" placeholder="Enter password" name=userPasword ></td>
</tr>

<tr>
<td><label for="email"><b>EMAIL</b></td></label>
<td><input type="text" placeholder="Enter Email" name=email></td></tr>

<tr>
<td><label for="mobile"><b>MOBILE NUMBER</b></td></label>
<td><input type="number" placeholder="Enter Mobile Number" name=mobileNumber></td></tr>

<tr>
<td><label for="address"><b>ADDRESS</b></td></label>
<td><input type="text" placeholder="Enter Address" name=address></td></tr>

<tr>

<tr>
<td><label for="role"><b>ROLE</b></td></label></td>
<td><input type="radio" name="role" value="A"> Admin </td>



</tr>

<tr>
<td>
<input type="radio" name="role" value="U"> User </td>
</td>
</tr>
<td>
<input type="submit" value="submit">
<input type="reset" value="clear">
</td>
</tr>



</table>
</div>
</form>
</body>
</html>