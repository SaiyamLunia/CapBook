<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form action="logoutAccount" method="post"
			modelAttribute="account">
			<h1>Welcome ${account.firstName }</h1>
			<table>
				<tr>
					<td><input style="margin-right: 20px" type="submit"
						value="Logout" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>