<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CapBook</title>
</head>
<body>
	<div>
		<form action="forgotPasswordSecurity" method="post">
			EmailID: <input type="email" name="emailId"> 
			<input	type="submit" name="submit">
		</form>
	</div>
	<div>
		<form action="forgotPassword" method="post">
		<input type="hidden" name="emailId" value="${requestScope.user.emailId}" readonly="readonly"><br>
			Security Question:  <input type="text" value="${requestScope.user.securityQues}" readonly="readonly"><br>   
			Security Answer :<input type="text" name="securityAnswer" placeholder="Enter Answer"><br>
			<input	type="submit" name="submit" value="Verify"><br>
		</form>
	</div>
	
	<div>Your Passowrd :<input type="text" value="${requestScope.password}" readonly="readonly"></div>
</body>
</html>