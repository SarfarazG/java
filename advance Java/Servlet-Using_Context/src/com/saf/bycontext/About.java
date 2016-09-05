package com.saf.bycontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class About extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		ServletContext context=getServletContext();
		String u =(String)context.getAttribute("un");
		String p =(String)context.getAttribute("pass");
		
		String s = "<html><body bgcolor="+"green"+"> Welcome:</br> your username is: "+u+"</br> your password is :"+p+"</br><a href="+"Home"+">Home</a></br><a>About</a></br><a href="+"Setting"+">Setting</a></br></body></html>";
		
		PrintWriter pw=resp.getWriter();
		pw.write(s);
		
		
	}

}
