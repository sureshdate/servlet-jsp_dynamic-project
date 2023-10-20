package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//if u extends genericServlet then u do not need to  write all 5 methods only write service method 
//generic servlet sare methods ko override krta he except service method.
//if u want protocol servlet specific functionality chahiye to extend kro httpServlet.ie.doget(),dopost(),doput()
public class First_Program implements Servlet{

	ServletConfig config;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("init method call");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method call ");
		
		res.setContentType("text/html");
		
	    PrintWriter out=res.getWriter();
	    
	    out.println("welcome to servlet tutorial");
	    
	    out.println("Today"+new Date().toString());
		
	}
	public void destroy() {
		System.out.println("destroy method call");
		
	}

	//non life cycle method
	@Override
	public ServletConfig getServletConfig() {
		
		return this.config;
	}

	@Override
	public String getServletInfo() {
		
		return "this servlet is created by durgesh tiwari";
	}

}
