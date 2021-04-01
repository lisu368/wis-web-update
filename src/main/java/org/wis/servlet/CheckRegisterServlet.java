package org.wis.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.wis.entity.User;
import org.wis.service.IUserService;
import org.wis.service.impl.UserServiceImpl;
import org.wis.util.SHAUtil;


//Author: Liang Sun
//Date: March 31, 2021
//Purpose: WIS Checking Register Servlet
//Project: Welcome Institute of Studies (WIS) Web App Project
/**
 * Servlet implementation class CheckRegisterServlet
 */
public class CheckRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get user information from register page
		String UserName=request.getParameter("UserName");
		//String UserPassword=request.getParameter("UserPassword");
		String UserPassword=SHAUtil.encryptThisString(request.getParameter("UserPassword"));
		User auser=new User(UserName,UserPassword);
		IUserService userService=new UserServiceImpl();
		// execute add query 
		int result=userService.addUser(auser);
		HttpSession session=request.getSession(); 
		if (result==0) {
			//go to fail page with error information
		    session.setAttribute("error","Name is in use. Please change name and try it again.");  
			response.sendRedirect("fail.jsp");
			
			
	
		}
		if (result==-1) {
		//	go to fail page with error information
			
		    session.setAttribute("error","Error in MySQL. Please try it again.");  
			response.sendRedirect("fail.jsp");
	
	
		}
		if (result==1) {
		//	go to fail page with error information
			
		    session.setAttribute("error","Register fail. Please try it again.");  
			response.sendRedirect("fail.jsp");
	
	
		}
		if (result==2) {
		//	go to success page with user information
			
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
