package model;

import java.sql.Date;

public class HoursInformation extends HoursInfo
{
	private String dayOfWeek;
	
	public HoursInformation(int hoursId, String weekId, Date dayDate, double workedHours, double ptoHours, double leaveHours, double holidayHours, String empId, int dayId)
	{
		super(hoursId, weekId, dayDate, workedHours, ptoHours, leaveHours, holidayHours, empId, dayId);
		this.dayOfWeek = getDayOfWeek(dayId);
	}
	
	public HoursInformation(String weekId, Date dayDate, double workedHours, double ptoHours, double leaveHours, double holidayHours, String empId, int dayId)
	{
		super(weekId, dayDate, workedHours, ptoHours, leaveHours, holidayHours, empId, dayId);
		this.dayOfWeek = getDayOfWeek(dayId);
	}
	
	public String getDayOfWeek()
	{
		return dayOfWeek;
	}
	
	public String getDayOfWeek(int dayId)
	{
		if (dayId == 1)
		{
			this.dayOfWeek = "Sunday";
		}
		else if (dayId == 2)
		{
			this.dayOfWeek = "Monday";
		}
		else if (dayId == 3)
		{
			this.dayOfWeek = "Tuesday";
		}
		else if (dayId == 4)
		{
			this.dayOfWeek = "Wednesday";
		}
		else if (dayId == 5)
		{
			this.dayOfWeek = "Thursday";
		}
		else if (dayId == 6)
		{
			this.dayOfWeek = "Friday";
		}
		else if (dayId == 7)
		{
			this.dayOfWeek = "Saturday";
		}
		return dayOfWeek;
	}
}
