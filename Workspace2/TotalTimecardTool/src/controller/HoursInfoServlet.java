package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EmployeeInfo;

/**
 * Servlet implementation class HoursInfoServlet
 */
@WebServlet("/HoursInfoServlet")
public class HoursInfoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoursInfoServlet()
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
		HttpSession hs = request.getSession();
		EmployeeInfo employee = (EmployeeInfo) hs.getAttribute("employee");
		HoursInfoHelper hih = new HoursInfoHelper();
		request.setAttribute("allHours", hih.showAllHours(employee.getEmpId()));
		if(hih.showAllHours(employee.getEmpId()) == null )
		{
			request.setAttribute("allHours", " ");
		}
		getServletContext().getRequestDispatcher("/hoursMenu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
