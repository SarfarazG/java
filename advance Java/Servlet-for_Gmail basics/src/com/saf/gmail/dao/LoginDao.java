package com.saf.gmail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.saf.gmail.dto.Getset;
import com.saf.gmail.utility.Singleton;

public class LoginDao {
	
	
	public Getset Access_Record(Getset g){
		
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		
		
		String pass=g.getPassword();
		String mail=g.getEmail();
	
		try 
		{
			PreparedStatement pstmt = con.prepareStatement("select * from servlet.register where email=? and password=? ");
			System.out.println(pass+"========="+mail);
			pstmt.setString(3, mail);
			pstmt.setString(2, pass);
			
			ResultSet rs=pstmt.executeQuery();
				if(rs.next())
				{
					System.out.println("DONE");	
					
				
				}
				else 
				{
					g=null;
				}
	    }
		catch (SQLException e) 
		{
			
			System.out.println("inside dao "+e);
		}
		return g;
	}
	
		
}
