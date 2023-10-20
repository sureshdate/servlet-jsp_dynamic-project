package com.servlet.register.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {

	//if u use in Registerservlet then by default you have to write doGet method not doPost method.
	//when u use in RegisterServlet sendRedirect method  always create new object so object is destrying after create new object.so it will get value is null.
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("this is successs servlet");
		out.println("<h1>Succesfully registered</h1>");
		
	
	}
	
}

