<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><!DOCTYPE html>
<title>Employee Info</title>
</head>
<body>
<form>
<a>EMPLOYEE INFO</a><br /><br />
	<table>
		<tr>
			<td>Employee ID:</td>
			<td>${employee.empId}</td>
		</tr>
		<tr>
			<td>First Name:</td>
			<td>${employee.firstName}</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>${employee.lastName}</td>
		</tr>
		<tr>
			<td>Pay Per Hour:</td>
			<td>${employee.payPerHour}</td>
		</tr>
	</table>
<a href = "mainMenu.jsp"> Back to Main Menu </a><br />
</form>
</body>
</html>