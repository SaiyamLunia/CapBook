 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/HomeStyle.css">
<title>Login page</title>
<style type="text/css">
.errorClass{
color: red;
font-size: 15px;
}
</style>
</head>
<body>
<h1 align="center">CAPBOOK</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
			<div align="center" class="errorClass">
					${errorMessage}
			</div>
			<form action="login" method="post">
				<h1 class="text-center">Login</h1>
				<label class="label control-label">E-mail</label>
				<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
					<input type="text" class="form-control" data-type="emailId"
						pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$"
						title="Must maintain the syntax : someone@email.com"
						required="required" name="emailId" placeholder="E-mail">
				</div>
				<label class="label control-label">Password</label>
				<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
					<input type="password" class="form-control" name="password" placeholder="password" required="required">
				</div>
				<div class="row">
					<div class="col-md-6">
						<input type="checkbox"><small>Remember me</small>
					</div>
					<div class="col-md-6">
						<a href="forgotPasswordPage"><p class="text-right">Forget Password</p></a>
					</div>
				</div>
				<input type="submit" class="btn btn-default" value="login" />
<!-- 				<a href="#"><div class="btn btn-default">SIGN IN</div></a> -->
			</form>
			</div>
			<div class="col-md-2"></div>
			<div class="col-md-5">
			<form:form action="registrationForm" method="post" modelAttribute="user" >
			<div align="center" class="errorClass">
					${errorMessage1}
			</div>
				<h2 class="text-center">Sign Up</h2>
				<label class="label control-label">First Name</label>
				<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
					<input type="text" class="form-control" required="required" name="firstName" placeholder="firstName">
				</div>
				<label class="label control-label">Last Name</label>
				<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
					<input type="text" class="form-control" required="required" name="lastName" placeholder="lastName">
				</div>
				<label class="label control-label">Email</label>
				<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
					<input type="text" class="form-control" data-type="emailId"
						pattern="^([a-zA-Z0-9_\-\.]+)@capgemini.com$"
						title="Must maintain the syntax : someone@capgemini.com"
						required="required" name="emailId" placeholder="E-mail">
				</div>
				<label class="label control-label">Gender</label>
				<div class="form-check-inline">
				  <label class="form-check-label">
					<input type="radio" class="form-check-input" name="gender" value="male"><font color="white">Male</font>
				  </label>
				</div>
				<div class="form-check-inline">
				  <label class="form-check-label">
					<input type="radio" class="form-check-input" name="gender" value="female"><font color="white">Female</font>
				  </label>
				</div>
				<label class="label control-label">Password</label>
				<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
					<input type="password" class="form-control" data-type="password"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
						title="Must contain	at least one number and one uppercase and lowercase letter, and
							at least 8 or more characters"
						required="required" name="password" placeholder="password">
				</div>
				
				<div class="dropdown">
				  <!-- <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Security Questions
				  <span class="caret"></span></button> -->
				  <label class="label control-label">Security Questions</label>
				  <select name="securityQues">
  						<option value="Your School Name">Your School Name</option>
 						 <option value="Your NickName">Your NickName</option>
 						<option value="Your Birth Place">Your Birth Place</option>
						</select>
						
				</div>
				<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-hand-right"></span></span>
					<input type="text" class="form-control" name="securityAnswer" placeholder="securityAnswer">
					</div>
				<input type="submit" class="btn btn-default" value="Register" />
				<!-- <a href="#"><div class="btn btn-default">SIGN UP</div></a> -->
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>