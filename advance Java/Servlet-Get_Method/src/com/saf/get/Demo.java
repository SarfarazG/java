package com.saf.get;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Date d = new Date();
		System.out.println(d);
		String s = "<html><body> Today's date is : "+ d+ " </body></html>";
			PrintWriter pw = resp.getWriter();
			pw.write(s);
		
		
	}
	

}
