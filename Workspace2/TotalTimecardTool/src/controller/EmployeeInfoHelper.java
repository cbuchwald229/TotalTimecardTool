package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.*;

public class EmployeeInfoHelper
{
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("TotalTimecardTool");
	public void cleanUp()
	{
		emfactory.close();
	}
	
	public EmployeeInfo showAllInfo(String empId)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		EmployeeInfo found = em.find(EmployeeInfo.class, empId);
		em.close();
		return found;
	}
}
