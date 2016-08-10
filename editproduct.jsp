<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>SunGlass Admin</title>
<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

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
<form:form class="form-horizontal" method="post" action="productupdate">
<center>
<table>
    <tr>
        
 <div class="form-group">
      <label class="control-label col-sm-2" path="pname" for="pname"><font color="white">Product-Name:</font></label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="pname" path="pname" placeholder="Enter your productname here" required/>
      </div>
      
    </div>
        
    </tr>
     <div class="form-group">
      <label class="control-label col-sm-2" path="pdescription" for="pdescription"><font color="white">Product-Description:</font></label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="pdescription" path="pdescription" placeholder="Enter your Product Description here" required/>
      </div>
      
    </div>
    <tr>
        <div class="form-group">
      <label class="control-label col-sm-2" path="price" for="price"><font color="white">Product-Price:</font></label>
      <div class="col-sm-5">          
        <input type="text" class="form-control" id="price" path="price" placeholder="Enter Product price here" required/>
      </div>
      
    </div>
        
        
    </tr>
     
   
     <tr>
     <td colspan="2"><input type="submit" value="Add Product"></td>
    
    
   
     <td colspan="2"><input type="reset" value="Reset"></td>
    
</tr>
    
</table>
</center>
</form:form>




</html>