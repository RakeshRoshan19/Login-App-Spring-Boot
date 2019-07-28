<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Login</a></li>
					<li><a href="/register">New Registration</a></li>
					<li><a href="/show-users">All Users</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to Login Page</h1>
			
			<h2>${ut.firstName} ${ut.lastName}'s RR first Java website</h2>

		</div>
	</div>
	
	<div class="container text-centered">
		<div class="alert alert-success">
			<h4>Kesari Song 1</h4>
		</div>
		
		<iframe width="560" height="315" 
		src="https://www.youtube.com/embed/wF_B_aagLfI" frameborder="0" allow="accelerometer; autoplay; 
		encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		
		
		<div class="alert alert-success">
			<h4>Simmba Song 2</h4>
		</div>
		
		<iframe width="560" height="315" 
		src="https://www.youtube.com/embed/hejXc_FSYb8" frameborder="0" allow="accelerometer; autoplay; 
		encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		
		<div class="alert alert-success">
			<h4>Kabir Singh Song 3</h4>
		</div>
		
		<iframe width="560" height="315" 
		src="https://www.youtube.com/embed/LbPbCv8d90g" frameborder="0" allow="accelerometer; autoplay; 
		encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		<p> This is my favorite song </p>
		
		<div class="alert alert-success">
			<h4>Kabir Singh Song 4</h4>
		</div>
		
		<iframe width="560" height="315" 
		src="https://www.youtube-nocookie.com/embed/LbPbCv8d90g" frameborder="0" allow="accelerometer; autoplay; 
		encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		
			
	</div>	
		

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<!-- 	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>	-->
</body>
</html>