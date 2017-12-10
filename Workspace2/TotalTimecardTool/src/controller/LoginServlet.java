package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
	{
		private static final long serialVersionUID = 1L;
	    public void EmployeeInfo()
	    {
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			EmployeeInfoHelper eih = new EmployeeInfoHelper();
			String empId = request.getParameter("empId");
			HttpSession hs = request.getSession();
			hs.setAttribute("employee", eih.showAllInfo(empId));
			if(eih.showAllInfo(empId) == null)
			{
				getServletContext().getRequestDispatcher("/loginError.jsp").forward(request, response);
			}
			
			getServletContext().getRequestDispatcher("/mainMenu.jsp").forward(request, response);
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			doGet(request, response);
		}
	}