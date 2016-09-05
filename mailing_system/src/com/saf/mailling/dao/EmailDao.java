package com.saf.mailling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.saf.mailling.uitility.Singleton;

public class EmailDao {
	
	public String email_data(String code){
		
		Singleton s = Singleton.getS();
		Connection con =s.getCon();
		
		String q1 = "select *from mailing.login where CODE=?";
		String q2 = "update mailing.login set ACTIVATION=? where CODE=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(q1);
			pstmt.setString(1, code);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				
				PreparedStatement pstmt2 = con.prepareStatement(q2);
				pstmt2.setString(1, "on");
				pstmt2.setString(2, code);
				
				int a = pstmt2.executeUpdate();
				if(a>0){
					
					return "active account";
				}
				else{
					
					return "Regester First";
				}
				
			}
			
			
		} catch (SQLException e) {
			
			System.out.println("error inside the Email dao");
			
		}
		return "error";
		
		
	}

}
