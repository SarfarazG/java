package com.saf.bycontext;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
			
			ServletContext context=getServletContext();
			
			context.setAttribute("un",user);
			context.setAttribute("pass", pass);
		
			RequestDispatcher rd = req.getRequestDispatcher("/xyz");
			rd.forward(req, resp);
		
	}
	

}

