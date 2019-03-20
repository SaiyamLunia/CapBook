<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Index Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body>
	<div class="cg-header-base"></div>
	<div class="cg-header">
		<div id="img1" class="cg-header">
			<img src="resources/images/capgemini.png" />
		</div>
		<div id="form1" class="cg-header">
			Email or Phone<br> <input placeholder="Email" type="mail"
				name="name" /><br> <input type="checkbox" /> keep me logged in
		</div>

		<div id="form2" class="fb-header">
			Password<br> <input placeholder="Password" type="password"
				name="password" /><br> Forgotten your password?
		</div>
	</div>
	<input type="submit" class="submit1" value="login" />
	<div class="fb-body">
			<div id="intro1" class="cg-body">Capgemini helps you connect and share with the <br>
			people in your company.</div>
			<div id="intro2" class="cg-body">Create an account</div>
			<div id="img2" class="cg-body"><img src="world.png" /></div>
			<div id="intro3" class="cg-body">It's free and always will be.</div>
			<div id="form3" class="cg-body">
				<input placeholder="First Name" type="text" id="namebox" name="name1" />
				<input placeholder="Last Name" type="text" id="namebox"  /> <br>
				<input placeholder="Emai" type="text" id="mailbox" /><br>
				<input placeholder="Re-enter email" type="text" id="mailbox"  /><br>
				<input placeholder="Password" type="password" id="mailbox"  /><br>
				<input type="date" id="namebox"  /><br><br>
				<input type="radio" id="r-b" name="sex" value="male" />Male
				<input type="radio" id="r-b" name="sex" value="female" />Female<br><br>
				<p id="intro4">By clicking Create an account, you agree to our Terms and that 
				you have read our Data Policy, including our Cookie Use.</p>
				<input type="submit" class="button2" value="Create an account" />
				<br><hr>
				<p id="intro5">Create a Page for a celebrity, band or business.</p>
			</div>
		</div>
</body>
</html>