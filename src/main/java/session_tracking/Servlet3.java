package session_tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		Cookie ck=new Cookie("nm",name);//cookies stored in key value pair
		resp.addCookie(ck);
		
		out.println("welcome to servlet name=" +name);
		
		out.println(" <br> <a href='servlet4'>Servlet</a>");
	}

	
}



//session means a particular interval of time
//sessio tracking is a way to maintain state(data)of an user.It is also known as session  maintain in servlet
//http protocol is a stateless protocol.

//there are 4 technique used in session tracking
//1)cookies
//2/HIDEN FORM FIELD
//3)Httpsession
//4)URlewriting