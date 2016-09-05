package com.saf.mailling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import com.saf.mailling.dto.LoginDto;
import com.saf.mailling.dto.RegDto;
import com.saf.mailling.uitility.Singleton;

public class loginDao {
	
	
	Singleton s =Singleton.getS();
	Connection con = s.getCon();
	
	public int login_data(LoginDto dto){
		System.out.println("email"+dto.getEmail());
				
		try {
			PreparedStatement pstmt = con.prepareStatement("Select * from 	mailing.login where EMAIL=? and PASSWORD=? and ACTIVATION=?");
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, "on");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println("inside the while statement");
				return 1;
				
			}
		} catch (SQLException e) {
			
			System.out.println("error "+e);
		}
		return 0;		
	}
}
