<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome to WIS</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" href="css/wis-web.css">
    <script src="js/countdowntimer.js"></script>

</head>
<body>
	<% // Author: Liang Sun %>
	<% // Date: March 31, 2021 %>
	<% // Purpose: WIS Fail Page %>
	<% // Project: Welcome Institute of Studies (WIS) Web App Project %>
		<div class="imgcontainer">
  		<img src="picture/10.jpg" alt="Snow" style="width:100%;">

  		<div class="top-left text-danger">
  		<h1> Welcome to WIS &nbsp;&nbsp;&nbsp;&nbsp; <small class="text-muted">Welcome Institute of Studies is waiting for you!</small>  </h1>
  
  		</div>

	</div>

	<div class="jumbotron pb-1 pt-1 mb-0 rounded-0 bg-danger">

  
 
  <div class="container">
	<div class="row">
	
		<div class="col-lg-2">
		    <a href="index.jsp" class="btn disabled">Home</a>
		  </div>
	
	
	
		<div class="col-lg-2">
			<a href="login.jsp" class="btn disabled">Login</a>
		</div>
		<div class="col-lg-2">
			<a href="register.jsp" class="btn disabled">Register</a>
				
		</div>
		
		
		 <div class="dropdown col-lg-2">
		    <button type="button" class="btn  dropdown-toggle" data-toggle="dropdown">
		      Program
		    </button>
		    <div class="dropdown-menu">
		      <a class="dropdown-item" href="#">IT Certificate</a>
		      <a class="dropdown-item" href="#">L5 IT Diploma </a>
		      <a class="dropdown-item" href="#">L6 IT Diploma </a>
		      <a class="dropdown-item" href="#">Business Certificate</a>
		      <a class="dropdown-item" href="#">L5 Business Diploma </a>
		      <a class="dropdown-item" href="#">L6 Business Diploma </a>
		    </div>
		  </div>
	
			 <div class="dropdown col-lg-2">
		    <button type="button" class="btn  dropdown-toggle" data-toggle="dropdown">
		      Lecture
		    </button>
		    <div class="dropdown-menu">
		      <a class="dropdown-item" href="#">Ace</a>
		      <a class="dropdown-item" href="#">Bob</a>
		      <a class="dropdown-item" href="#">Cade</a>
		      <a class="dropdown-item" href="#">David</a>
		      <a class="dropdown-item" href="#">Edward</a>
		      <a class="dropdown-item" href="#">Fred</a>
		    </div>
		  </div>
	
		  
		  
		 <div class="dropdown col-lg-2">
		    <button type="button" class="btn  dropdown-toggle" data-toggle="dropdown">
		      Student
		    </button>
		    <div class="dropdown-menu">
		      <a class="dropdown-item" href="#">Information</a>
		      <a class="dropdown-item" href="#">Mark</a>
		      <a class="dropdown-item" href="#">Parent</a>
		      <a class="dropdown-item" href="#">Fee</a>
		     
		    </div>
		  </div>
		  
		  
		
		

	</div>
</div>
</div>

	<%
	// get "error" information
		String error=(String)session.getAttribute("error");
		if(error!=null){
			%>
			  		
  			<div class="container col-md-8 pt-5 text-danger">
		
					
				 
				 <h2> <%=error %>  </h2>
				  <h2> We will go back to Home page in 5 seconds.   </h2>
				 <h2 id="countdowntimer"></h2>
				 
				
			</div>
			
						
			
			<%
				

			
			
			
		}else{
			// go directly to home page without "error" information
			response.sendRedirect("index.jsp");
		}
  		
  		
	%>

</body>
</html>