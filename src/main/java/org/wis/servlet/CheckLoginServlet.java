package org.wis.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wis.entity.User;
import org.wis.service.IUserService;
import org.wis.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;  

/**
 * 
 * Servlet implementation class CheckLoginServlet
 */
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get user information from login page
		String UserName=request.getParameter("UserName");
		String UserPassword=request.getParameter("UserPassword");
		
		User auser=new User(UserName,UserPassword);
		IUserService userService=new UserServiceImpl();
		// check information in MySQL
		int result=userService.loginCheckUser(auser);
		HttpSession session=request.getSession(); 
		if (result==-1) {
			//go to fail page with error information
		    
		    session.setAttribute("error","Error in MySQL. Please try it again.");  
			response.sendRedirect("fail.jsp");
		
		}
		if (result==0) {
			//go to fail page with error information
		    session.setAttribute("error","Login fail. Please try it again.");  
			response.sendRedirect("fail.jsp");
	
		}
		if (result==1) {
			//go to success page with user information
		    session.setAttribute("user",auser);  
			response.sendRedirect("success.jsp");
			
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
