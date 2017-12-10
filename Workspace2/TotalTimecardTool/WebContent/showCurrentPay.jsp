<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><!DOCTYPE html>
<title>Current Pay</title>
</head>
<body>
<a>CURRENT PAY FOR THE WEEK</a><br /><br />
<input type ="text" name = "currentPay" value = "${employee.currentPay}"><br/>
<a href = "mainMenu.jsp"> Back to Main Menu </a><br />
</body>
</html>