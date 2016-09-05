package com.saf.gmail.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.gmail.utility.Singleton;

public class Reg  extends HttpServlet{
	
	
	int rs;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
		ServletContext context =getServletContext();
		
		String name=req.getParameter("n");
		String passw=req.getParameter("pass");
		String Email=req.getParameter("em");
		
		context.setAttribute("n",name );
		context.setAttribute("pass",passw );
		context.setAttribute("em",Email );

		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		
		
		try {
			
			PreparedStatement pstmt=con.prepareStatement("insert into servlet.register values(?,?,?)");
			
			pstmt.setString(1, name);
			pstmt.setString(2, passw);
			pstmt.setString(3, Email);

			rs = pstmt. executeUpdate();	
		    PrintWriter pw = resp.getWriter();
			String out="<html><body> <h2>"+"Now U Are Memeber of gmail</h2></br> <h3>your Email-id is</h3>:"+Email+"</br><h3>your password is</h3> :"+passw+"<br/></body></html>";
			pw.write(out);
			pw.print("<a href='Log-in.html'>login here</a>");
			}
	    catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	}
	
	
	

