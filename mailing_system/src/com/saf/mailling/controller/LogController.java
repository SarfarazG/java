package com.saf.mailling.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saf.mailling.dao.loginDao;
import com.saf.mailling.dto.LoginDto;
import com.saf.mailling.services.LoginServices;

public class LogController extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Email = req.getParameter("em");
		System.out.println("Email is"+Email);
		String Pass = req.getParameter("pass");
		System.out.println("password is"+Pass);
		
		LoginDto ld = new LoginDto();
		ld.setEmail(Email);
		ld.setPassword(Pass);
		
		
		LoginServices ls = new LoginServices();
		int a = ls.login_logic(ld);
		HttpSession s = req.getSession(true);
		if(a!=0){
			s.setAttribute("login", ld);
			req.getRequestDispatcher("Home.jsp").forward(req, resp);
			
		}
		else {
			
			s.setAttribute("login", "Error in username or password ");
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		}
	}
	

}
