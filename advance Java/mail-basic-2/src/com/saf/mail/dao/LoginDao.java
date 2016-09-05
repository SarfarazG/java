package com.saf.mail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.saf.mail.dto.Getset;
import com.saf.mail.utility.Singleton;

public class LoginDao {
	
	
	public int Access_Record(Getset g){
		
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		
		
		String pass=g.getPassword();
		String mail=g.getEmail();
		String name = g.getUsername(); 	
	
		try 
		{
			PreparedStatement pstmt = con.prepareStatement("insert into servlet.register (NAME,EMAIL,PASSWORD) values(?,?,?)");
			System.out.println(pass+"========="+mail+"==="+name);
			
			pstmt.setString(1, name);
			pstmt.setString(2, mail);
			pstmt.setString(3, pass);
			
			int a = pstmt.executeUpdate();
				if(a>0)
				{
					System.out.println("data entered succesfully");	
					return a;
					
				}
				else 
				{
					return 0;
				}
	    }
		catch (SQLException e) 
		{
			
			System.out.println("inside dao "+e);
		}
		return 0;
	}
	
		
}
