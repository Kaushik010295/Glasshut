<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SunGlass Log-in Page</title>
<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script type="text/javascript">
alert("You must log-in to buy your favourite glasses.");
</script>
</head>
<style>
 body
  {
  background-color:#1A5276;
  }
</style>
<body>
<center> <h1 style="color:white"> WELCOME TO GLASS HUT </h1></center><hr>
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
<form action="isValidCredentials" method="post">
<div class="container">
<center>
<h3 style="color:white"> LOG IN 
<h3 style="color:red">&nbsp;&nbsp;User-id :  <input type="text" name="user"></h3>
<h3 style="color:red">Password:  <input type="password" name="pass"></h3>
<h4 style="color:black"><input type="submit" value="Sign-in">
<input type="reset" value="Cancel"></h4>
<h2 style="color:white"> NOT A REGISTERED USER?? <a href="registration"><h2 style="color:white"> SIGN UP </a>
</body>
</html>