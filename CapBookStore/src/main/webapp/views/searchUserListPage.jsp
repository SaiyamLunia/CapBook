<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Search List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Search List</h2>
		<div class="row">
		<div class="card-deck">
		<s:forEach var="user" items="${userList}">
			<div class="card" style="width: 400px">
				<img class="card-img-top" src="resources/images/pic1.jpg"
					alt="Card image" style="width: 100%">
				<div class="card-body">
					<h4 class="card-title">${user.firstName} &nbsp ${user.lastName}</h4>
					<p class="card-text">Some example text some example text. John
						Doe is an architect and engineer</p>
					<a href="#" class="btn btn-primary">See Profile</a>
				</div>
			</div>
		</s:forEach>
				</div>
	</div></div>
</body>
</html>