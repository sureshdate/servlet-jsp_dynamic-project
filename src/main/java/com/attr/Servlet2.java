package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int fn=Integer.parseInt(req.getParameter("fn"));
		int sn=Integer.parseInt(req.getParameter("sn"));
		int sum=(int) req.getAttribute("s");
		int mul=fn*sn;
		res.setContentType("text/html"); 
		PrintWriter out=res.getWriter();
		
	out.println("<h1>sum="+sum+", multiplication="+mul+"</h1>");
		
	}
}

