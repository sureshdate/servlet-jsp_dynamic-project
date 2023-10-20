package com.servlet.register.app;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<h1>welcome to Register servlet</h1>");
	String name=req.getParameter("user_name");
	String email=req.getParameter("user_email");
	String password=req.getParameter("user_password");
	String gender=req.getParameter("user_gender");
	String course=req.getParameter("user_course");
	String cond=req.getParameter("condition");
	
	//
	//jdbc
	//save to db
	
RequestDispatcher rd1=req.getRequestDispatcher("success");
rd1.forward(req, res);//forward method use in cliet side
//if u dont want to use request dispatcher then u can use sendredirect method.and this mthod is by default get method i.e public void doGet
//res.sendRedirect("success")//sendRedirect method in server side.

	if(cond!=null) {
		
	if(cond.equals("checked"))
	{
		out.println("<h2>Name :"+name+"</h2>");
		out.println("<h2>Name :"+password+"</h2>");
		out.println("<h2>Name :"+email+"</h2>");
		out.println("<h2>Name :"+gender+"</h2>");
		out.println("<h2>Name :"+course+"</h2>");
		
	}
	else {
		out.println("<h2>we have not accepted terms and condition</h2>");
	}
	}
	else {
		out.println("<h2>we have not accepted terms and condition</h2>");
		//i want to include index.html
		//get the object of requestDispatcher
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req,res);
		
		
		
		
		
		
		
		
		
		
		
	}
}
}
