<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" src="path/to/font-awesome/css/font-awesome.min.css">
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #009688;
	color: white;
}

.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.topnav-right {
  float: right;
}

</style>

</head>
<body>
<div class="topnav-right">
  </div>
	<span style="color: green">${msg}</span>
	<table id="customers">
		<tr>
			<th>EID</th>
			<th>ENAME</th>
			<th>SALARY</th>
			<th>EMAIL</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>
		<c:forEach var="employee" items="${emps}" >
			<tr>
				<td>${employee.eid}</td>
				<td>${employee.ename}</td>
				<td>${employee.esal}</td>
				<td>${employee.email}</td>
				<td><a href="./delete?eid=${employee.eid}"><i class="fa fa-trash-o" aria-hidden="true"></i></a></td>
				<td><a href="./update?eid=${employee.eid}"><i class="fa fa-refresh" aria-hidden="true"></i></a></td>
			</tr>
		</c:forEach>
	</table>
	<a class="button" href="home.jsp">HOME</a>
</body>
</html>