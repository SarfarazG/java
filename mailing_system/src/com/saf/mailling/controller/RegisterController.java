package com.saf.mailling.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.ForwardRequest;

import com.saf.mailling.dao.RegDao;
import com.saf.mailling.dao.loginDao;
import com.saf.mailling.dto.RegDto;
import com.saf.mailling.services.REGServices;
import com.saf.mailling.uitility.Singleton;

public class RegisterController extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		System.out.println("name"+name);
		String ENno =req.getParameter("eno");
		System.out.println("enrollment"+ENno);
		String address = req.getParameter("add");
		System.out.println("address"+address);
		String mobile =req.getParameter("mno");
		System.out.println("mobile"+mobile);
		String branch = req.getParameter("branch");
		System.out.println("branch"+branch);
		String email = req.getParameter("email");
		System.out.println("email"+email);
		String pasd = req.getParameter("pass");
		System.out.println("pass"+pasd);
		
		RegDto g = new RegDto();
		
		if(name!=null && email!=null){
			
			if(name!="" && email!="")
			{
					if(name.length()>3 && email.length()>3)
					{
						g.setEmail(email);
						g.setName(name);
						g.setAddress(address);
						g.setBranch(branch);
						g.setEno(ENno);
						g.setMobile(mobile);
						g.setPassword(pasd);
						
						try {
								
							REGServices s = new REGServices();
							int a = s.regsdata(g);
							
							if(a!=0){
								req.setAttribute("k4", g);
								req.setAttribute("url", "http://localhost:8080/mailing_system/email?code="+g.getCode());
								req.getRequestDispatcher("EmailVarify.jsp").forward(req, resp);
								
							}else {
								req.setAttribute("k4", "error");
								req.getRequestDispatcher("display.jsp").forward(req, resp);
								
							}
							}catch (Exception e) {	
								System.out.println("error in controller");
							}
					}						
					else
					{
						System.out.println("error inside defining length");
						req.setAttribute("k1", "Length must me >3");
						req.getRequestDispatcher("register.jsp").forward(req, resp);		
					}
			}
			else
			{
				System.out.println("error inside defining empty");
				req.setAttribute("k2","field must not be empty");
				req.getRequestDispatcher("register.jsp").forward(req, resp);
			}
		}
		else
		{
			System.out.println("error inside defining null");
			req.setAttribute("k3","field must not be null");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}
		
}
}		