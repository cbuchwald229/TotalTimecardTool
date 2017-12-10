package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;

/**
 * Servlet implementation class EmployeeInfoServlet
 */
@WebServlet("/EmployeeInfoServlet")
public class EmployeeInfoServlet extends HttpServlet
	{
		private static final long serialVersionUID = 1L;
	    public void EmployeeInfo()
	    {
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			HttpSession hs = request.getSession();
			EmployeeInfo employee = (EmployeeInfo) hs.getAttribute("employee");
			request.setAttribute("employee", employee);
			getServletContext().getRequestDispatcher("/employeeInfo.jsp").forward(request, response);
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			doGet(request, response);
		}
	}
