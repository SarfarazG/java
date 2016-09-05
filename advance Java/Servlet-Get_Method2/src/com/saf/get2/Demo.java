package com.saf.get2;

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
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
		String name="sarfaraz";
		String email="safg@gmail.com";
		int no=972390467;
		
		String s = "<html><body> My bio_data is as follow: </br> "+ "NAME: "+name +" </br> EMAIL: "+email+"</br> PHONE NO: "+no +" </body></html>";
		PrintWriter pw = resp.getWriter();
		pw.write(s);			
		
		
	}
	

}

