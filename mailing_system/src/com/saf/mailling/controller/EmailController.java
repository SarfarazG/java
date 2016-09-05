package com.saf.mailling.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.mailling.services.EmailServices;

public class EmailController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String code = req.getParameter("code");
		System.out.println("code is"+code);
		
		EmailServices es = new EmailServices();
		String s= es.email_logic(code);
		
		if(s.equals("active account")){
			
			req.setAttribute("msg","account activated" );
		}
		else if (s.equals("Register First")) {
			req.setAttribute("msg", "Register yourself first");
		}else{
			
			req.setAttribute("msg", "error");
		}
		req.getRequestDispatcher("Login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		doPost(req,resp);
	}
	

}
