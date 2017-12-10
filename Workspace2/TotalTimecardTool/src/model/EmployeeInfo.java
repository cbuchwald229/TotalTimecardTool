package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeInfo
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_ID")
	private String empId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Pay_Per_Hour")
	private double payPerHour;
	
	public EmployeeInfo()
	{
	}
	
	public EmployeeInfo(String empId, String firstName, String lastName, double payPerHour)
	{
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.payPerHour = payPerHour;
	}
	
	public String getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public double getPayPerHour()
	{
		return payPerHour;
	}
	
	public void setPayPerHour(double payPerHour)
	{
		this.payPerHour = payPerHour;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", payPerHour="
				+ payPerHour + "]";
	}
}