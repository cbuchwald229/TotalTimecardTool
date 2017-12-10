package controller;

import java.io.IOException;
import java.sql.Date;
import javax.persistence.Column;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;

/**
 * Servlet implementation class addHoursInfoServlet
 */
@WebServlet("/addHoursInfoServlet")
public class addHoursInfoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addHoursInfoServlet()
    {
         // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String weekId = request.getParameter("weekId");
		Date daydate = Date.valueOf(request.getParameter("dayDate"));
		double workedHours = Double.parseDouble(request.getParameter("workedHours"));
		double ptoHours = Double.parseDouble(request.getParameter("ptoHours"));
		double leaveHours = Double.parseDouble(request.getParameter("leaveHours"));
		double holidayHours = Double.parseDouble(request.getParameter("holidayHours"));
		String empId = request.getParameter("empId");
		Integer dayId = Integer.parseInt(request.getParameter("dayId"));
		HoursInfo hi = new HoursInfo(weekId, daydate, workedHours, ptoHours, leaveHours, holidayHours, empId, dayId);
		HoursInfoHelper hih = new HoursInfoHelper();
		hih.insertHours(hi);
		getServletContext().getRequestDispatcher("/addHours.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession hs = request.getSession();
		EmployeeInfo employee = (EmployeeInfo) hs.getAttribute("employee");
		String weekId = request.getParameter("weekId");
		Date daydate = Date.valueOf(request.getParameter("dayDate"));
		Integer dayId = Integer.parseInt(request.getParameter("dayId"));
		double workedHours = Double.parseDouble(request.getParameter("workedHours"));
		double ptoHours = Double.parseDouble(request.getParameter("ptoHours"));
		double leaveHours = Double.parseDouble(request.getParameter("leaveHours"));
		double holidayHours = Double.parseDouble(request.getParameter("holidayHours"));
		String empId = employee.getEmpId();
		HoursInfo hi = new HoursInfo(weekId, daydate, workedHours, ptoHours, leaveHours, holidayHours, empId, dayId);
		HoursInfoHelper hih = new HoursInfoHelper();
		hih.insertHours(hi);
		getServletContext().getRequestDispatcher("/addHours.jsp").forward(request, response);
	}
}
