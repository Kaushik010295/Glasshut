<!doctype html>
<html>
<head>
<title> GlassHut</title>
<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="style.css" rel="stylesheet">

<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 80%;
      margin: auto;
  }
  body
  {
  background-color:#1A5276;
  }
  </style>
</head>
<body>
	<center>
		<h1 style="color:indianred">Welcome to Glass Hut</h1>
	</center>
	<hr>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
	<div class="navbar-header">
	<a class="navbar-brand" href="#">GLASS HUT </a>
	</div>
	</div>
	<ul class="nav navbar-nav">
	<li class="active"> <a href="#"> Home </a></li>
	<li> <a href="#"> About </a>
	<li> <a href="login" > Sign in</a>
	<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">CATEGORIES <span class="caret"></span></a>
          <ul class="dropdown-menu">
	<li><a href="men"> MEN'S SECTION</a></li>
	<li> <a href="women"> WOMEN'S SECTION</a></li>
	<li> <a href="Child"> KID'S SECTION </a></li>
	<li> <a href="acc"> ACCESORIES</a></li>
	
	</ul>
	</li>
	
	</ul><br>
	</nav>
	<div class="container">
		<br>
      <center> <h2 style="color:indianred"><b><i><u>WORLD CLASS COLLECTION OF GLASSES </u></i></b></h2></center>
		<div id="FirstCarousel" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#FirstCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#FirstCarousel" data-slide-to="1"></li>
				<li data-target="#FirstCarousel" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner" role="list">
				<div class="item">
					<img src="resources/images/background20.jpg" alt="glass1" width="3000" height="400">
					<div class="carousel-caption">
						<h1>SUN GLASSES</h1>
					</div>
				</div>
				<div class="item active">
					<img src="resources/images/main1.jpg" alt="glass2" width="3000" height="400">
					<div class="carousel-caption">
						<h1>SUN GLASSES</h1>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/background21.jpg" alt="glass3" width="3000" height="400">
					<div class="carousel-caption">
						<h1>SUN GLASSES</h1>
					</div>
				</div>
			</div>
			<a class="left carousel-control" href="#FirstCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only"> Previous</span>
			</a> <a class="right carousel-control" href="#FirstCarousel"
				role="button" data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only"> Next</span>
			</a>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		
		<div class="row">
			<div class="col-md-6">
				<a href="men"> <img src="resources/images/gb1.jpg" height="300"
					width="400" border="20"><h1 style="color:indianred">CLICK HERE FOR MEN'S </h1></a>
			</div>
			<div class="col-md-6">
				<a href="women"> <img src="resources/images/gb2.jpg" height="300"
					width="400" border="20"><h1 style="color:indianred">CLICK HERE FOR WOMEN'S </h1></a>
			</div>
			</div>
			<br>
			<br>
			<br>
			<br>
			<div class="row">
			<div class="col-md-6">
				<a href="Child"> <img src="resources/images/gb4.jpg" height="300"
					width="400" border="20"><h1 style="color:indianred">CLICK HERE FOR KID'S</h1></a>
			</div>
	
			<div class="col-md-6">
				<a href="acc"> <img src="resources/images/gb5.jpg" height="300"
					width="400" border="20" ><h1 style="color:indianred">CLICK HERE FOR ACCESORIES</h1></a>
			</div>

		</div>
		</div>
</body>
</html>