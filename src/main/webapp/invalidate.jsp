<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.wis.entity.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // Author: Liang Sun %>
	<% // Date: March 31, 2021 %>
	<% // Purpose: Invalidation sessions %>
	<% // Project: Welcome Institute of Studies (WIS) Web App Project %>

	<%
	//  invalidat the "error" session
		String error=(String)session.getAttribute("error");
		if(error!=null)
		session.invalidate();
		else{
		//  invalidat the "user" session
			User auser=(User)session.getAttribute("user");
			if(auser!=null)
			session.invalidate();
		}
		
		
		
		// go back to home page
		response.sendRedirect("index.jsp");
	%>
</body>
</html>