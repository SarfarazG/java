package com.saf.mail.controller;

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

import com.saf.mail.dao.LoginDao;
import com.saf.mail.dto.Getset;
import com.saf.mail.utility.Singleton;

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
		String name = req.getParameter("un");
	
		context.setAttribute("pass",pass);
		context.setAttribute("em",Email );
		
		Getset g = new Getset();
		
		System.out.println(pass+"=========in servetl:=="+Email);
		
		g.setPassword(pass);
		g.setEmail(Email);
		g.setUsername(name);
	
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		try {
			
			System.out.println(con);
			LoginDao ld=new LoginDao();
			int a =ld.Access_Record(g);
	
			if(a>0){	
				PreparedStatement pstmt = con.prepareStatement("select * from servlet.register ORDER BY NAME");
				ResultSet rs=pstmt.executeQuery();
			
				PrintWriter pw =resp.getWriter();
				pw.println("<html><body>");
				pw.println("<table border=10>");
				pw.println("<tr><th>USERNAME</th><th>PASSWORD</th><th>EMAIL</th></tr>");
				while(rs.next()){	
				String user = rs.getString("NAME");
				String pas = rs.getString("PASSWORD");
				String email = rs.getString("EMAIL");
				//if(email!=email)
				pw.println("<tr><td>"+user+"</td><td>"+pas+"</td><td>"+email+"</td></tr>");
				}
			}
			else{
				
				resp.sendRedirect("Log-in.html");
				
			}	
		}
	    catch (Exception e) {
			System.out.println("error"+e);
		}
	}
	
}	
	
	

