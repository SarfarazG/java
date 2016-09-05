package com.saf.mailling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import com.saf.mailling.dto.LoginDto;
import com.saf.mailling.dto.RegDto;
import com.saf.mailling.uitility.Singleton;

public class EditPasswordDao {
	
	Singleton s = Singleton.getS();
	Connection con =s.getCon();
	
	public String get_pass(LoginDto ld1){
		
		try {
			
			System.out.println("inside try");
			PreparedStatement pstmt =con.prepareStatement("select * from mailing.login where EMAIL=? ");
			pstmt.setString(1, ld1.getEmail());
			System.out.println("ans"+ld1.getEmail());
			ResultSet rs = pstmt.executeQuery();
			System.out.println("inside query");

			if(rs.next()){
				System.out.println("inside if");
				return ld1.getPassword(); 
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("error in sql:"+e);
		}
		return null;
	}
	
	public int ChangePass(String New,LoginDto ld1){
		
		try {
			PreparedStatement pstmt = con.prepareStatement("update mailing.login set PASSWORD=? where EMAIL=?");
			pstmt.setString(1, New);
			pstmt.setString(2, ld1.getEmail());
			int a=pstmt.executeUpdate();
			if(a>0){
				System.out.println("password in login table updated succesfully");
				return 1;
			}
			else{
				System.out.println("Something went wrong");
				return 0;
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("error in sql2:"+e);
		}
		
		return 0;
	}
}
