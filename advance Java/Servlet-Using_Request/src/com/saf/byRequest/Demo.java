package com.saf.byRequest;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.RequestDispatcher;
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
			
			req.setAttribute("un",user);
			req.setAttribute("pass", pass);
		
			RequestDispatcher rd = req.getRequestDispatcher("/xyz");
			rd.forward(req, resp);
		
	}
	

}

