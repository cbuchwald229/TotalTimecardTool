package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.*;

public class HoursInfoHelper
{
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("TotalTimecardTool");
	public void cleanUp()
	{
		emfactory.close();
	}
	
	public void deleteHours(HoursInfo toDelete)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<HoursInfo> typedQuery = em.createQuery("select hi from HoursInfo hi where hi.hoursId = :selectedHoursId", HoursInfo.class);
		typedQuery.setParameter("selectedHoursId", toDelete.getHoursId());
		typedQuery.setMaxResults(1);
		HoursInfo result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public void insertHours(HoursInfo hi)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(hi);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<HoursInfo> searchForHoursByWeekId(String weekId)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<HoursInfo> typedQuery = em.createQuery("select hi from HoursInfo hi where hi.weekId = :selectedWeekId", HoursInfo.class);
		typedQuery.setParameter("selectedWeekId", weekId);
		List<HoursInfo> foundHours = typedQuery.getResultList();
		em.close();
		return foundHours;
	}
	
	public List<HoursInfo> searchForHoursByDayDate(Date dayDate)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<HoursInfo> typedQuery = em.createQuery("select hi from HoursInfo hi where hi.dayDate = :selectedDayDate", HoursInfo.class);
		typedQuery.setParameter("selectedDayDate", dayDate);
		List<HoursInfo> foundHours = typedQuery.getResultList();
		em.close();
		return foundHours;
	}
	
	public HoursInfo searchForHoursByHoursId(int hoursId)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		HoursInfo found = em.find(HoursInfo.class, hoursId);
		em.close();
		return found;
	}
	
	public List<HoursInformation> showAllHours(String empId)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<HoursInfo> typedQuery = em.createQuery("select hi from HoursInfo hi where hi.empId = :selectedEmpId", HoursInfo.class);
		typedQuery.setParameter("selectedEmpId", empId);
		List<HoursInfo> hoursList = (List<HoursInfo>)typedQuery.getResultList();
		List<HoursInformation> allHoursList = new ArrayList<HoursInformation>();
		for(int i = 0; i < hoursList.size(); i++)
		{
			HoursInfo hoursForDay = (HoursInfo) hoursList.get(i);
			HoursInformation hoursToEdit = new HoursInformation(hoursForDay.getHoursId(), hoursForDay.getWeekId(), hoursForDay.getDayDate(), hoursForDay.getWorkedHours(), hoursForDay.getPtoHours(), hoursForDay.getLeaveHours(), hoursForDay.getHolidayHours(), hoursForDay.getEmpId(), hoursForDay.getDayId());
			allHoursList.add(hoursToEdit);
		}
		em.close();
		return allHoursList;
	}
	
	public void updateHours(HoursInfo toEdit)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
}