package com.saf.mailling.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.mailling.services.AjaxServices;

public class AjaxController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String s=req.getParameter("saf");
		System.out.println(s);
		
		AjaxServices as = new AjaxServices();
		int answer= as.ajax_logic(s);
		if(answer>0){
			
			resp.getWriter().write("<html><body><h4 'style=color:red;'>PLEASE ENTER THE OTHER USERNAME</h4></body></html>");
		}
		else{
			
			resp.getWriter().write("<html><body><h4 'style=color:green;'>AVAILABLE</h4></body></html>");

		}	
	}
	

}
