<!-- <html> -->
<!-- <head> -->
<!-- <link -->
<!-- 	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" -->
<!-- 	rel="stylesheet" id="bootstrap-css"> -->
<!-- <script -->
<!-- 	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script> -->
<!-- <script -->
<!-- 	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
<!-- <link rel="stylesheet" -->
<!-- 	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" -->
<!-- 	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" -->
<!-- 	crossorigin="anonymous"> -->
<!-- <link type="text/css" rel="stylesheet" -->
<!-- 	href="resources/css/profileEdit.css" /> -->
<!-- <style type="text/css"> -->
<!-- /* .pass_show { */ -->
<!-- /* 	position: relative */ -->
<!-- /* } */ -->

<!-- /* .pass_show .ptxt { */ -->
<!-- /* 	position: absolute; */ -->
<!-- /* 	top: 50%; */ -->
<!-- /* 	/* 	right: 10px; */ */ -->
<!-- /* 	left: 250px; */ -->
<!-- /* 	z-index: 1; */ -->
<!-- /* 	color: #f36c01; */ -->
<!-- /* 	margin-top: -10px; */ -->
<!-- /* 	cursor: pointer; */ -->
<!-- /* 	transition: .3s ease all; */ -->
<!-- /* } */ -->
<!-- /* .form-controller { */ -->
<!-- /*     display: block; */ -->
<!-- /*     width: 16%; */ -->
<!-- /*     height: calc(1.5em + .75rem + 2px); */ -->
<!-- /*     padding: .375rem .75rem; */ -->
<!-- /*     font-size: 1rem; */ -->
<!-- /*     font-weight: 400; */ -->
<!-- /*     line-height: 1.5; */ -->
<!-- /*     color: #495057; */ -->
<!-- /*     background-color: #fff; */ -->
<!-- /*     background-clip: padding-box; */ -->
<!-- /*     border: 1px solid #ced4da; */ -->
<!-- /*     border-radius: .25rem; */ -->
<!-- /*     transition: border-color .15s ease-in-out,box-shadow .15s ease-in-out; */ -->
<!-- /* } */ -->
<!-- /* .pass_show .ptxt:hover { */ -->
<!-- /* 	color: #333333; */ -->
<!-- /* } */ -->
<!-- </style> -->
<!-- <script type="text/javascript"> -->
<!-- // 	$(document).ready(function() { -->
<!-- // 		$('.pass_show').append('<span class="ptxt">Show</span>'); -->
<!-- // 	}); -->
<!-- // 	$(document).on('click', '.pass_show .ptxt', function() { -->
<!-- // 		$(this).text($(this).text() == "Show" ? "Hide" : "Show"); -->
<!-- // 		$(this).prev().attr('type', function(index, attr) { -->
<!-- // 			return attr == 'password' ? 'text' : 'password'; -->
<!-- // 		}); -->
<!-- // 	}); -->
<!-- </script> -->
<!-- <title>Password Change</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<h3>Change Password</h3> -->
<!-- 	<form role="form" method="post" action="changePassword"> -->
<!-- 		<label>Current Password</label> -->
<!-- 		<div class="form-group pass_show"> -->
<!-- 			<input type="password" class="form-controller" -->
<!-- 				placeholder="Current Password" name="password"> -->
<!-- 		</div> -->
<!-- 		<label>New Password</label> -->
<!-- 		<div class="form-group pass_show"> -->
<!-- 			<input type="password" class="form-controller" -->
<!-- 				placeholder="New Password" name="newPassword"> -->
<!-- 		</div> -->
<!-- 		<label>Confirm Password</label> -->
<!-- 		<div class="form-group pass_show"> -->
<!-- 			<input type="password" class="form-controller" -->
<!-- 				placeholder="Confirm Password" name="confirmNewPassword"> -->
<!-- 		</div> -->
<!-- 		<div class="form-group"> -->
<!-- 			<label class="col-md-3 control-label"></label> -->
<!-- 			<div class="col-md-8"> -->
<!-- 				<input type="button" class="btn btn-primary" value="Save Changes"> -->
<!-- 				<span></span> <input type="reset" class="btn btn-default" -->
<!-- 					value="Reset"> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</form> -->
<!-- </body> -->
<!-- </html> -->

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link type="text/css" rel="stylesheet"
	href="resources/css/profileEdit.css" />
<title>Profile</title>
</head>
<body>
	<div class="container">
    <h1>Change Password</h1>
  	<hr>
  	<form class="form-horizontal" role="form" method="post" action="changePassword">
          <div class="form-group">
            <label class="col-lg-3 control-label">Password</label>
            <div class="col-lg-8">
              <input class="form-control" type="password"  name="password" required="required">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">New Password</label>
            <div class="col-lg-8">
              <input class="form-control" type="password" name="newPassword" required="required">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Confirm Password</label>
            <div class="col-lg-8">
              <input class="form-control" type="password" name="confirmNewPassword" required="required">
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-8">
              <input type="submit" class="btn btn-primary" value="Save Changes">
              <span></span>
              <input type="reset" class="btn btn-default" value="Reset">
            </div>
          </div>
        </form>
      </div>
  </div>
</div>
<hr>
</body>
</html>