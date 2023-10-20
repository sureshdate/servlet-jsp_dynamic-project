package com.practice.httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

//httpservlet have all the methods
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		System.out.println("this is a get method..............");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();	
		out.print("<h1>This is get method of my sevlet</h1>");
	}
	
}
