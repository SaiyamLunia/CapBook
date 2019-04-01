<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet"
	href="resources/css/profileStyle.css" />
<script src="resources/js/jquery.js"></script>
<script>
	$(document).ready(function() {

		$(".box13").click(function() {
			$(".box13").css('background-color', '#e9f0f2');
			$(".box11").css('background-color', 'white');
			$(".box12").css('background-color', 'white');
			$(".box14").css('background-color', 'white');
			$(".frnpad").fadeIn("slow");
			$(".frnpadx").fadeIn("slow");
			$(".aboutpad").fadeOut("slow");
			$(".aboutpadx").fadeOut("slow");
			$(".phpad").fadeOut("slow");
			$(".phpadx").fadeOut("slow");
			$(".postp").fadeOut("slow");
			$(".postpx").fadeOut("slow");
			$(".post1p").fadeOut("slow");
			$(".post1px").fadeOut("slow");
			$(".abox1").fadeOut("slow");
			$(".abox1x").fadeOut("slow");
			$(".abox2").fadeOut("slow");
			$(".abox2x").fadeOut("slow");
			$(".abox3").fadeOut("slow");
			$(".abox3x").fadeOut("slow");
		});

		$(".box14").click(function() {
			$(".box14").css('background-color', '#e9f0f2');
			$(".box11").css('background-color', 'white');
			$(".box12").css('background-color', 'white');
			$(".box13").css('background-color', 'white');
			$(".phpad").fadeIn("slow");
			$(".phpadx").fadeIn("slow");
			$(".aboutpad").fadeOut("slow");
			$(".aboutpadx").fadeOut("slow");
			$(".frnpad").fadeOut("slow");
			$(".frnpadx").fadeOut("slow");
			$(".postp").fadeOut("slow");
			$(".postpx").fadeOut("slow");
			$(".post1p").fadeOut("slow");
			$(".post1px").fadeOut("slow");
			$(".abox1").fadeOut("slow");
			$(".abox1x").fadeOut("slow");
			$(".abox2").fadeOut("slow");
			$(".abox2x").fadeOut("slow");
			$(".abox3").fadeOut("slow");
			$(".abox3x").fadeOut("slow");
		});

		$(".box12").click(function() {
			$(".box12").css('background-color', '#e9f0f2');
			$(".box11").css('background-color', 'white');
			$(".box13").css('background-color', 'white');
			$(".box14").css('background-color', 'white');
			$(".aboutpad").fadeIn("slow");
			$(".aboutpadx").fadeIn("slow");
			$(".frnpad").fadeOut("slow");
			$(".frnpadx").fadeOut("slow");
			$(".phpad").fadeOut("slow");
			$(".phpadx").fadeOut("slow");
			$(".postp").fadeOut("slow");
			$(".postpx").fadeOut("slow");
			$(".post1p").fadeOut("slow");
			$(".post1px").fadeOut("slow");
			$(".abox1").fadeOut("slow");
			$(".abox1x").fadeOut("slow");
			$(".abox2").fadeOut("slow");
			$(".abox2x").fadeOut("slow");
			$(".abox3").fadeOut("slow");
			$(".abox3x").fadeOut("slow");
		});

		$(".box11").click(function() {
			$(".box11").css('background-color', '#e9f0f2');
			$(".box12").css('background-color', 'white');
			$(".box13").css('background-color', 'white');
			$(".box14").css('background-color', 'white');
			$(".aboutpad").fadeOut("slow");
			$(".aboutpadx").fadeOut("slow");
			$(".postp").fadeIn("slow");
			$(".postpx").fadeIn("slow");
			$(".post1p").fadeIn("slow");
			$(".post1px").fadeIn("slow");
			$(".abox1").fadeIn("slow");
			$(".abox1x").fadeIn("slow");
			$(".abox2").fadeIn("slow");
			$(".abox2x").fadeIn("slow");
			$(".abox3").fadeIn("slow");
			$(".abox3x").fadeIn("slow");
			$(".frnpad").fadeOut("slow");
			$(".frnpadx").fadeOut("slow");
			$(".phpad").fadeOut("slow");
			$(".phpadx").fadeOut("slow");
		});
		$(".box13").click(function() {
		})
	});
</script>
</head>
<body>
	<div class="header1">

		<div id="img3" class="header1">
			<img src="resources/images/logo.png" id="img3" />
		</div>
		<form action="searchUser">
			<div id="searcharea" class="header1">
				<input placeholder="search here..." type="text" id="searchbox" name="username"/>
			</div>
		</form>

		<div id="profilearea" class="header1">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="profilearea1" class="header1">Profile</div>

		<div id="profilearea3" class="header1">|</div>

		<div id="profilearea4" class="header1">
			<a href="home11.php">Home</a>
		</div>

		<div id="findf" class="header1">
			<img src="resources/images/frn.png" height="30" />
		</div>

		<div id="message" class="header1">
			<img src="resources/images/chat.png" height="30" />
		</div>

		<div id="notification" class="header1">
			<img src="resources/images/noti.png" height="30" />
		</div>

		<div id="profilearea2" class="header1">|</div>

		<div id="setting" class="header1">
			<div class="dropdown">
				<button type="submit" data-toggle="dropdown">
					<img src="resources/images/set.png" height="30" />
				</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="profileEditPage">Edit Profile</a> <a
						class="dropdown-item" href="changePasswordPage">Change
						Password</a>
				</div>
			</div>
		</div>

		<div id="logout" class="header1">
			<div class="dropdown">
				<button type="submit" data-toggle="dropdown">
					<img src="resources/images/lo.png" height="30" />
				</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="/">Logout</a>
				</div>
			</div>
		</div>

	</div>
	<div class="header0001"></div>
	<div class="coverpad"></div>

	<div class="coverpadx">
		<img src="resources/images/cover.jpg" width="850px" />

	</div>
	<div class="profilepic"></div>
	<div class="profilepicx">
		<c:forEach var="img" items="${user.images}">
					<c:if test="${img.albumName=='profilePic'}">
					<img  src="${img.imageUrl}" style="height:130px;width:130px">
				</c:if>
				</c:forEach>
	</div>
	<div class="username">
		<font color="black"> ${user.firstName } <br>${user.lastName }</font>
	</div>

	<div class="box11">Timeline</div>

	<div class="box12">About</div>

	<div class="box13">Friends</div>

	<div class="box14">Photos</div>



	<select>

		<option selected>More</option>

		<option value="saab">Videos</option>

		<option value="opel">Places</option>

		<option value="audi">Pages</option>

	</select>
	<div class="chat-sidebarx"></div>
	<div class="chat-sidebar">
		<div id="chatnamebox" class="chat-sidebar">jb</div>

		<div id="chatnamebox1" class="chat-sidebar">jb</div>

		<div id="chatnamebox2" class="chat-sidebar">jb</div>

		<div id="chatnamebox3" class="chat-sidebar">jb</div>

		<div id="chatnamebox4" class="chat-sidebar">jb</div>

		<div id="chatnamebox5" class="chat-sidebar">jb</div>

		<div id="chatnamebox6" class="chat-sidebar">jb</div>

		<div id="chatnameboxp1" class="chat-sidebar">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="chatnameboxp2" class="chat-sidebar">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="chatnameboxp3" class="chat-sidebar">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="chatnameboxp4" class="chat-sidebar">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="chatnameboxp5" class="chat-sidebar">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="chatnameboxp6" class="chat-sidebar">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="chatnameboxp7" class="chat-sidebar">
			<img src="resources/images/prof.png" height="30" />
		</div>

	</div>
	<div class="postp">

		<div id="column-1" class="postp">
			update status | add photos | create photo album
			<hr>
			<br> <br> <br> <br> <br> <br>
			<hr>
		</div>
		
		<div>
		<form action="uploadStatus" method="post">
		<div id="postboxpos" class="postp">
			<textarea placeholder="What's in your mind" id="postbox" name="postBody"></textarea>
		</div>
		 <div id="postpos" class="postp">
			<input type="submit" id="buttonpost" value="post">
		</div> 
		</form>
	</div>
	
	<div class="postpx"></div>
	</div>
	<div class="post1px"></div>
	<div class="post1p">
		<img src="resources/images/prof.png" height="30" /><br> <br>
		<img src="resources/images/wall.jpg" height="411" width="580" /><br>
		<br>
		<p6>Like Comment Share</p6>
		<br>
		<hr>
		<p1>Amit Deb</p1>
		<p2> and</p2>
		<p1> 5 others</p1>
		<p2> like this</p2>

		<div id="post2text" class="post1p">
			<p3>Rani Mukharji </p3>
			<p2>with </p2>
			<p1> Arup Pegu</p1>
			<p2> and</p2>
			<p1> 15 others.</p1>
			<br>
			<p4>4 hrs.</p4>
		</div>

		<div id="commentprof2" class="post1p">
			<img src="resources/images/prof.png" height="30" />
		</div>

		<div id="commentboxpos2" class="post1p">
			<input type="textarea" placeholder="comment" id="commentbox" />
		</div>
	</div>
	</div>
	<div class="aboutpad"></div>
	<div class="aboutpadx"></div>
	<div class="sidebarp">
		<p7>Sponsored</p7>
		<hr>
	</div>
	<div class="abox1"></div>
	<div class="abox1x"></div>
	<div class="abox2"></div>
	<div class="abox2x"></div>
	<div class="abox3"></div>
	<div class="abox3x"></div>
	<div class="frnpad">frn</div>
	<div class="frnpadx"></div>
	<div class="phpad">photo</div>
	<div class="phpadx"></div>
</body>
</html>