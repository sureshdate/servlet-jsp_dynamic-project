package com.servlet.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet5")
public class Servlet5 extends HttpServlet {
  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("nm");
		
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>name:"+name+"</h1>");
		out.println("<a href='servlet6?username="+name+"'>Servlet6</a>");
	
		
	}
}
