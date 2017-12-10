<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Hours</title>
</head>
<body>
	<form action = "editHoursInfoServlet" method="post">
	<a>EDIT HOURS</a><br /><br />
	<table>
		<tr>
			<td>WeekId:</td>
			<td><input type = "text" name = "weekId" value = "${hoursToEdit.weekId}"></td>
		</tr>
		<tr>
			<td>DayId:</td>
			<td>
				<select name = "dayId">
					<option value=1>Sunday</option>
					<option value=2>Monday</option>
					<option value=3>Tuesday</option>
					<option value=4>Wednesday</option>
					<option value=5>Thursday</option>
					<option value=6>Friday</option>
					<option value=7>Saturday</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>DayDate:</td>
			<td><input type = "text" name = "dayDate" value = "${hoursToEdit.dayDate}"></td>
		</tr>
		<tr>
			<td>WorkedHours:</td>
			<td><input type ="text" name = "workedHours" value = "${hoursToEdit.workedHours}"></td>
		</tr>
		<tr>
			<td>PTOHours:</td>
			<td><input type ="text" name = "ptoHours" value = "${hoursToEdit.ptoHours}"></td>
		</tr>
		<tr>
			<td>LeaveHours:</td>
			<td><input type ="text" name = "leaveHours" value = "${hoursToEdit.leaveHours}"></td>
		</tr>
		<tr>
			<td>HolidayHours:</td>
			<td><input type ="text" name = "holidayHours" value = "${hoursToEdit.holidayHours}"></td>
		</tr>
	</table>
	<input type = "hidden" name = "hoursId" value="${hoursToEdit.hoursId}">
	<input type = "submit" value= "Save Edited Hours">
	</form>
</body>
</html>