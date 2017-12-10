package model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hours")
public class HoursInfo
{
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Hours_ID")
	private int hoursId;
	@Column(name="Week_ID")
	private String weekId;
	@Column(name="Day_Date")
	private Date dayDate;
	@Column(name="Worked_Hours")
	private double workedHours;
	@Column(name="PTO_Hours")
	private double ptoHours;
	@Column(name="Leave_Hours")
	private double leaveHours;
	@Column(name="Holiday_Hours")
	private double holidayHours;
	@Column(name="Emp_ID")
	private String empId;
	@Column(name="Day_ID")
	private int dayId;
	
	public HoursInfo()
	{
	}
	
	public HoursInfo(int hoursId, String weekId, Date dayDate, double workedHours, double ptoHours, double leaveHours, double holidayHours, String empId, int dayId)
	{
		this.hoursId = hoursId;
		this.weekId = weekId;
		this.dayDate = dayDate;
		this.workedHours = workedHours;
		this.ptoHours = ptoHours;
		this.leaveHours = leaveHours;
		this.holidayHours = holidayHours;
		this.empId = empId;
		this.dayId = dayId;
	}
	
	public HoursInfo(String weekId, Date dayDate, double workedHours, double ptoHours, double leaveHours, double holidayHours, String empId, int dayId)
	{
		this.weekId = weekId;
		this.dayDate = dayDate;
		this.workedHours = workedHours;
		this.ptoHours = ptoHours;
		this.leaveHours = leaveHours;
		this.holidayHours = holidayHours;
		this.empId = empId;
		this.dayId = dayId;
	}
	
	public String getWeekId()
	{
		return weekId;
	}
	
	public void setWeekId(String weekId)
	{
		this.weekId = weekId;
	}
	
	public Date getDayDate()
	{
		return dayDate;
	}
	
	public void setDayDate(Date dayDate)
	{
		this.dayDate = dayDate;
	}
	
	public int getHoursId()
	{
		return hoursId;
	}
	
	public void setHoursId(int hoursId)
	{
		this.hoursId = hoursId;
	}
	
	public double getWorkedHours()
	{
		return workedHours;
	}
	
	public void setWorkedHours(double workedHours)
	{
		this.workedHours = workedHours;
	}
	
	public double getPtoHours()
	{
		return ptoHours;
	}
	
	public void setPtoHours(double ptoHours)
	{
		this.ptoHours = ptoHours;
	}
	
	public double getLeaveHours()
	{
		return leaveHours;
	}
	
	public void setLeaveHours(double leaveHours)
	{
		this.leaveHours = leaveHours;
	}
	
	public double getHolidayHours()
	{
		return holidayHours;
	}
	
	public void setHolidayHours(double holidayHours)
	{
		this.holidayHours = holidayHours;
	}

	public String getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	
	public int getDayId()
	{
		return dayId;
	}
	
	public void setDayId(int dayId)
	{
		this.dayId = dayId;
	}
	
	@Override
	public String toString() {
		return "HoursInfo [weekId=" + weekId + ", dayDate=" + dayDate + ", hoursId=" + hoursId + ", workedHours="
				+ workedHours + ", ptoHours=" + ptoHours + ", leaveHours=" + leaveHours + ", holidayHours="
				+ holidayHours + ", empId=" + empId + ", dayId=" + dayId + "]";
	}
}