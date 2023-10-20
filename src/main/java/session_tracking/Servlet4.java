package session_tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;
import javax.servlet.http.*;
@WebServlet("/servlet4")
public class Servlet4 extends HttpServlet {

	@Override//servlet1 me anker tag use krte automatically get method hi call hota he iske liye servlet2 me dopost nhi use kiya
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		javax.servlet.http.Cookie[] ck=req.getCookies();//changing type of cookie[] and getting cookies
		out.println("welcome to servlet4 name=" +ck[0].getValue() + name);
		
	}

	
}