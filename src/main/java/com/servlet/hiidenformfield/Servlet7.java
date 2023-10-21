package com.servlet.hiidenformfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet7")
public class Servlet7 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("nm");
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<form action='servlet8'> <input type='hidden' name='user' value='"+name+"'> <br>"
		 +"<button type='submit'>Servlet8</buuton> </form>");
	}

	
}
