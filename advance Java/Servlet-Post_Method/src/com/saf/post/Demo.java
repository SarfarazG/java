package com.saf.post;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
			String user = req.getParameter("un");
			String pass = req.getParameter("pass");
			String male = req.getParameter("gen");
			String female = req.getParameter("gen");
			String add = req.getParameter("add");
			String email = req.getParameter("em");
			
			String out = "<html><body>Username is: "+user+"</br> Password is: "+pass+"</br> Gender is: "+male+"</br> Email is: "+email+"</br> Address is: "+add+"";
			
			PrintWriter pw = resp.getWriter();
			pw.write(out);
			
		
		
	}
	

}

