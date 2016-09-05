package com.saf.Gmail;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Reg  extends HttpServlet{
	
	int rs;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String Fname=req.getParameter("fn");
		String Lname=req.getParameter("ln");
		String passw=req.getParameter("pass");
		String cpassw=req.getParameter("cpass");
		String Email=req.getParameter("em");
		
		String Driv="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306";
		String user="root";
		String pass="root";
		
		
		
		
		try {
			Class.forName(Driv);
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement pstmt=con.prepareStatement("insert into servlet.register values(?,?,?,?,?)");
			
			pstmt.setString(1, Fname);
			pstmt.setString(2, Lname);
			pstmt.setString(3, passw);
			pstmt.setString(4, cpassw);
			pstmt.setString(5, Email);

			
			rs = pstmt. executeUpdate();
			if(rs==1){
				
				PrintWriter pw = resp.getWriter();
				pw.write("hi"+ Fname +"Now U Are Memeber of gmail \n");
				pw.write("your Email-id is:"+Email);
				pw.write("your password is :"+passw);
				}
			else {
				System.out.println("invalid input");
				}

			}
	    catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
		
	}
	

	
	
	
	
	


