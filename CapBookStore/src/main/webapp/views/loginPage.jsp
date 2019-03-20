<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Login</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div class="jumbotron text-center">
		<h2>Account Login</h2>
	</div>
	<div align="center">
		<form:form action="loginAccount" method="post"
			modelAttribute="account">
			<table>
				<tr>
					<td>EmailId:</td>
					<td><form:input path="emailID" size="30" /></td>
					<td><form:errors path="emailID" cssClass="error" />
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" size="30" /></td>
					<td><form:errors path="password" cssClass="error" />
				</tr>
			</table><br><br>
			<table>
				<tr>
					<td><input style="margin-right: 20px" type="submit"
						value="Login" /></td>
					<td><input style="margin-right: 20px" type="reset"
						value="reset" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	<div align="center" class="error">
		${errorMessage}
	</div>
</body>
</html>