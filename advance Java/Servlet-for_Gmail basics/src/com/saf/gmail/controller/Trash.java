package com.saf.gmail.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Trash extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		

		ServletContext context =getServletContext();

		String u=(String)context.getAttribute("em");
		
		String s="<html><body bgcolor="+"yellow"+"> <h2>Welcome:"+u+"</h2></br></br><a href="+"inbox"+">Inbox</a></br><a href="+"draft"+">Draft</a></br><a >Trash</a></br></body></html>";

		resp.getWriter().write(s);
		
	}
		

}
