package com.servlet.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet6")
public class Servlet6 extends HttpServlet {
  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username=req.getParameter("username");
		
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>name:"+username+"</h1>");
	
	
		
	}
}
