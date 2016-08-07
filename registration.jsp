<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Registration Page</title>
<style>
body
{
  background-image:url(resources/images/bg10.jpg);

   background-repeat:repeat;

}
</style>
</head>
<body>

<center> <h1 style="color:black"> WELCOME TO GLASS HUT </h1></center><hr>

<form action="register" method="post">
<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#">GLASS HUT</a>
</div>
<ul class="nav navbar-nav">
<li class="item active"> <a =href="#"> HOME</a></li>

</ul>
</div>
</nav>


<div class="container">
<br>
<br>

<center>
<h1 style="color:maroon"><u> REGISTRATION PAGE</u></h1><br>

<table>
<tr>
<td>
<h3 style="color:maroon">First Name : </td>
<td> <input type="text" name="firstname"></td>
<td>
<h3 style="color:maroon"> Last Name: </td><td> <input type="text" name="lastname"></td>
</tr>
<tr>
<td>
<h3 style="color:maroon">User Name : </td>
<td> <input type="text" name="username"></td>

</tr>
<tr>
<td>
<h3 style="color:maroon">Password :</td><td> <input type="password" name="pass"></td></tr>
<tr>
<td>
<h3 style="color:maroon">Confirm Password :</td> <td> <input type="password" name="confirmpass"></td></tr>
<tr>
<td>
<tr>
<td>
<h3 style="color:maroon">E-mail :</td> <td> <input type="email" name="email"></td>
</tr>
<tr>
<td>
<h3 style="color:maroon">Phone number :</td> <td> <input type="text" name="phonenumber"></td>
</tr>
<tr>
<td>
 <h3 style="color:maroon"> Address:</td> <td> <textarea rows="4" cols="50">

</textarea>

</td>
</tr>



<tr>
<td>
<h4 style="color:blue"><input type="submit" value="Sign-in">

<input type="reset" value="Cancel"></h4>
</td>
</tr>
</table>
</form>

</body>
</html>