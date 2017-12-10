package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;

/**
 * Servlet implementation class editHoursInfoServlet
 */
@WebServlet("/editHoursInfoServlet")
public class editHoursInfoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editHoursInfoServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		HoursInfoHelper hih = new HoursInfoHelper();
		String act = request.getParameter("doThisToItem");
		
		if (act == null)
		{
			//no button has been selected
			HttpSession hs = request.getSession();
			EmployeeInfo employee = (EmployeeInfo) hs.getAttribute("employee");
			Integer hoursId = Integer.parseInt(request.getParameter("hoursId"));
			String weekId = request.getParameter("weekId");
			Date daydate = Date.valueOf(request.getParameter("dayDate"));
			double workedHours = Double.parseDouble(request.getParameter("workedHours"));
			double ptoHours = Double.parseDouble(request.getParameter("ptoHours"));
			double leaveHours = Double.parseDouble(request.getParameter("leaveHours"));
			double holidayHours = Double.parseDouble(request.getParameter("holidayHours"));
			String empId = employee.getEmpId();
			Integer dayId = Integer.parseInt(request.getParameter("dayId"));
			HoursInfo hi = new HoursInfo(hoursId, weekId, daydate, workedHours, ptoHours, leaveHours, holidayHours, empId, dayId);
			hih.updateHours(hi);
			getServletContext().getRequestDispatcher("/HoursInfoServlet").forward(request, response);
		}
		else if (act.equals("Delete Selected Hours"))
		{
			String hoursIdStr = request.getParameter("hoursId");
			Integer hoursId = Integer.parseInt(hoursIdStr);
			//Integer hoursId = Integer.parseInt(request.getParameter("hoursId"));
			HoursInfo hoursToDelete = hih.searchForHoursByHoursId(hoursId);
			hih.deleteHours(hoursToDelete);
			
			getServletContext().getRequestDispatcher("/HoursInfoServlet").forward(request, response);
		}
		else if (act.equals("Edit Selected Hours"))
		{
			Integer hoursId = Integer.parseInt(request.getParameter("hoursId"));
			HoursInfo hoursToEdit = hih.searchForHoursByHoursId(hoursId);
			request.setAttribute("hoursToEdit",  hoursToEdit);
			getServletContext().getRequestDispatcher("/editHours.jsp").forward(request,  response);
		}
		else if (act.equals("Add New Hours"))
		{
			getServletContext().getRequestDispatcher("/addHours.jsp").forward(request, response);
		}
	}

}
