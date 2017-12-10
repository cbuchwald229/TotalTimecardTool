package model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Weekly")
public class WeekInfo
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Week_ID")
	private String weekId;
	@Column(name="Week_Start")
	private Date weekStart;
	@Column(name="Week_End")
	private Date weekEnd;
	
	public WeekInfo()
	{
	}
	
	public WeekInfo(String weekId, Date weekStart, Date weekEnd)
	{
		this.weekId = weekId;
		this.weekStart = weekStart;
		this.weekEnd = weekEnd;
	}
	
	public String getWeekId()
	{
		return weekId;
	}
	
	public void setWeekId(String weekId)
	{
		this.weekId = weekId;
	}
	
	public Date getWeekStart()
	{
		return weekStart;
	}
	
	public void setWeekStart(Date weekStart)
	{
		this.weekStart = weekStart;
	}
	
	public Date getWeekEnd()
	{
		return weekEnd;
	}
	
	public void setWeekEnd(Date weekEnd)
	{
		this.weekEnd = weekEnd;
	}

	@Override
	public String toString() {
		return "WeekInfo [weekId=" + weekId + ", weekStart=" + weekStart + ", weekEnd=" + weekEnd + "]";
	}
}
