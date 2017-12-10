package model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Daily")
public class DayInfo
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Week_ID")
	private String weekId;
	@Column(name="Day_Date")
	private Date dayDate;
	@Column(name="Day_ID")
	private int dayId;
	
	public DayInfo()
	{
	}
	
	public DayInfo(String weekId, Date dayDate, int dayId)
	{
		this.weekId = weekId;
		this.dayDate = dayDate;
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
		return "DayInfo [weekId=" + weekId + ", dayDate=" + dayDate + ", dayId=" + dayId + "]";
	}
}
