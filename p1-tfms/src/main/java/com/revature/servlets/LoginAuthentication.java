package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.daoImpl.UserDaoImpl;

/**
 * Servlet implementation class LoginAuthentication
 */
public class LoginAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String x;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAuthentication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName= request.getParameter("Username");
		x=userName;
		String p= request.getParameter("Password"); 
		UserDaoImpl s=new UserDaoImpl();
		boolean flag=true;
		flag=s.checkValidUser(userName, p);
		String role=s.checkUserRole(userName, p);
		if(flag==true)
		{
			if(role.equals("admin")) {
				response.sendRedirect("ShowFeedback.jsp");
			}
			else if(role.equals("associate")) {
				response.sendRedirect("GiveFeedback.jsp");
			}
			else {
				response.sendRedirect("TrainerRating.jsp");
			}
		}
		else {
			response.sendRedirect("indexforinvalid.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
