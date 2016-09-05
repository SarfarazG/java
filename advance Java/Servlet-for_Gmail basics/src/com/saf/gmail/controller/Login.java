package com.saf.gmail.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.gmail.dao.LoginDao;
import com.saf.gmail.dto.Getset;
import com.saf.gmail.utility.Singleton;

public class Login extends HttpServlet{
	
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	
		ServletContext context =getServletContext();

	/*	String user=(String)context.getAttribute("n");
		String passw=(String)context.getAttribute("pass");
		String email=(String)context.getAttribute("em");*/
		
		String pass=req.getParameter("pass");
		String Email=req.getParameter("em");
	
		context.setAttribute("pass",pass);
		context.setAttribute("em",Email );
		
		Getset g = new Getset();
		
		System.out.println(pass+"=========in servetl:=="+Email);
		
		g.setPassword(pass);
		g.setEmail(Email);
	
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		try {
			
			System.out.println(con);
			LoginDao ld=new LoginDao();
			Getset a =ld.Access_Record(g);
	
			if(a!=null){
				System.out.println("hi");
				
				req.getRequestDispatcher("/inbox").forward(req, resp);
				
			}
			else{
				
				resp.sendRedirect("Log-in.html");
				
			}	
		}
	    catch (Exception e) {
			System.out.println(e);
		}
	}
	
}	
	
	

