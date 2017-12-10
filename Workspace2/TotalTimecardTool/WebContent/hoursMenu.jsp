<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><!DOCTYPE html>
<title>Hours Menu</title>
</head>
<body>
<form method = "post" action = "editHoursInfoServlet">
	<a>HOURS MENU</a><br /><br />
	<table>
		<tr>
			 <td align = center></td>
			 <td align = center>WeekID</td>
			 <td align = center>DayOfWeek</td>
			 <td align = center>Date</td>
			 <td align = center>WorkedHours</td>
			 <td align = center>PTOHours</td>
			 <td align = center>LeaveHours</td>
			 <td align = center>HolidayHours</td>
		</tr>
		<c:forEach items="${requestScope.allHours}" var="currentItem">
			<tr>
				<td><input type="radio" name="hoursId" value="${currentItem.hoursId}"></td>
				<td align = center>${currentItem.weekId}</td>
				<td align = center>${currentItem.dayOfWeek}</td>
				<td align = center>${currentItem.dayDate}</td>
				<td align = center>${currentItem.workedHours}</td>
				<td align = center>${currentItem.ptoHours}</td>
				<td align = center>${currentItem.leaveHours}</td>
				<td align = center>${currentItem.holidayHours}</td>
			</tr>
		</c:forEach>
	</table>
	<input type = "submit" value = "Edit Selected Hours" name="doThisToItem"><br/>
	<input type = "submit" value = "Delete Selected Hours" name="doThisToItem"><br/>
	<input type = "submit" value = "Add New Hours" name="doThisToItem"><br/>
</form>
</body>
</html>