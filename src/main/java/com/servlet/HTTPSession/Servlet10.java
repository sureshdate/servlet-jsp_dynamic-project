package com.servlet.HTTPSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet10")
public class Servlet10 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//creating a session object
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("username");
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("Name :"+name);
			
	
	}

	
}
