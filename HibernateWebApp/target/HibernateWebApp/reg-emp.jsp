<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style type="text/css">
.topnav-right {
	float: right;
}
</style>
</head>
<body>
	<div class="topnav-right">
		<a class="btn btn-secondary" href="./logout">logout</a>
	</div>

	<main>
	<div class="container">

		<div class="col-md-6 offset-md-3">
			<div class="card">
				<div class="card-header text-center primary-background">
					<span class="fa fa-3x fa-user-circle"></span> <br> Register
					Here
				</div>
				<div class="card-body">
					<form id="reg-form" action="./save" method="post">

						<div class="form-group">
							<label for="eid">Eno</label> <input type="text" name="eid"
								class="form-control" id="eid" aria-describedby="emailHelp"
								required placeholder="Enter id"> <small id="emailHelp"
								class="form-text text-muted"></small>
						</div>
						<div class="form-group">
							<label for="name">Ename</label> <input type="text" name="ename"
								class="form-control" id="name" aria-describedby="emailHelp"
								required placeholder="Enter name"> <small id="emailHelp"
								class="form-text text-muted"></small>
						</div>
						<div class="form-group">
							<label for="esal">Esal</label> <input type="text" name="esal"
								class="form-control" id="esal" aria-describedby="emailHelp"
								required placeholder="Enter salary"> <small
								id="emailHelp" class="form-text text-muted"></small>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">Email address</label> <input
								type="text" name="email" class="form-control"
								id="exampleInputEmail1" aria-describedby="emailHelp" required
								placeholder="Enter email"> <small id="emailHelp"
								class="form-text text-muted">We'll never share your
								email with anyone else.</small>
						</div>


						<div class="form-check">
							<input type="checkbox" name="check" class="form-check-input"
								id="exampleCheck1"> <label class="form-check-label"
								for="exampleCheck1">agree terms and conditions</label>
						</div>


						<button id="submit-btn" type="submit" class="btn btn-primary">Register</button>
					</form>

				</div>

				<div class="card-footer"></div>
			</div>


		</div>
	</div>
	</main>

</body>
</html>