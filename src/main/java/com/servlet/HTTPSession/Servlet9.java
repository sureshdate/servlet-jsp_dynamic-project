package com.servlet.HTTPSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet9")
public class Servlet9 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("nm");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Name:"+name+"</h1>");
		
		//creating a session object
		HttpSession session=req.getSession();
		session.setAttribute("username", name);
		out.println("<a href='servlet10'>Servlet 10</a>");
			
	
	}

	
}
