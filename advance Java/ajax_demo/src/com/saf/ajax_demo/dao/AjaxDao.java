package com.saf.ajax_demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.saf.ajax_demo.utility.Singleton;

public class AjaxDao {
	
	public int ajax_data(String s2){
		
		Singleton s =Singleton.getS();
		Connection con = s.getCon();
		
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("Select * from mailing.regester where EMAIL=?");
			pstmt.setString(1, s2);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				
				return 1;	
			}
			else {
				
				return 0;
			}
			
		} catch (SQLException e) {			
			System.out.println("ERROR"+e);		
		}	
		return 0;
	}

}
