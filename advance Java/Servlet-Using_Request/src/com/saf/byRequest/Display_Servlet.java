package com.saf.byRequest;

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
				
			
			String u =(String)req.getAttribute("un");
			String p =(String)req.getAttribute("pass");
			
				
			String s = " <html><body> Welcome:</br> your username is: "+u+"</br> your password is :"+p+"</br></br> </html></body>";
			
			PrintWriter pw=resp.getWriter();
			pw.write(s);
				
			}

}
