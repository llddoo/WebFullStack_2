<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a href="#">Page 2</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="./member/memberJoin.do"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="./member/memberLogin.do"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<h1>Member Join Page</h1>
			<form class="form-horizontal" action="./memberJoin.do" method="post">
				<div class="form-group">
					<label class="control-label col-sm-2" for="id">ID:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="id"
							placeholder="Enter ID" name="id">
					</div>
				</div>



				<div class="form-group">
					<label class="control-label col-sm-2" for="pw">Password:</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="pw"
							placeholder="Enter password" name="pw">
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="name">Name:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name"
							placeholder="Enter Name" name="name">
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email:</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" id="email"
							placeholder="Enter email" name="email">
					</div>
				</div>
				
							<div class="form-group">
					<label class="control-label col-sm-2" for="phone">Phone:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="phone"
							placeholder="Enter Phone" name="phone">
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Submit</button>
					</div>
				</div>
			</form>

		</div>

	</div>
</body>
</html>