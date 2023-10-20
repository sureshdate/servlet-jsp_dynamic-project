package com.attr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")//if you dont ant to write mapping in web.xml file then u can use annotation.
public class Servlet1 extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int fn=Integer.parseInt(req.getParameter("fn"));
		int sn=Integer.parseInt(req.getParameter("sn"));
		int sum=fn+sn;
		
		//we want to privide the value to 2nd servlet
		req.setAttribute("s", sum);//first parameter is string name 2nd value is want to passed
		RequestDispatcher rd=req.getRequestDispatcher("/servlet2");//forward the request to servlet 2 thas why we use request dispatcher.
		rd.forward(req, res);
	}
}
