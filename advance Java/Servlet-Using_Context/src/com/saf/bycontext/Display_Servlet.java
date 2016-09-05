package com.saf.bycontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display_Servlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
				
			ServletContext context=getServletContext();
			String u =(String)context.getAttribute("un");
			String p =(String)context.getAttribute("pass");
			
				
			String s = " <html><body bgcolor="+"pink"+"> Welcome:</br> your username is: "+u+"</br> your password is :"+p+"</br><a href="+"Home"+">Home</a></br><a href="+"About"+">About</a></br><a href="+"Seeting"+">Setting</a></br></body></html>";
			
			PrintWriter pw=resp.getWriter();
			pw.write(s);
				
			}

}
