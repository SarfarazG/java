package com.saf.mailling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.saf.mailling.dto.RegDto;
import com.saf.mailling.uitility.Singleton;

public class ProfileDao {
	
	public RegDto Profile_data(String s2){
		
		Singleton sg = Singleton.getS();
		Connection con = sg.getCon();
		RegDto rd = new RegDto();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("select * from mailing.regester where EMAIL=?");
			pstmt.setString(1, s2);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				rd.setName(rs.getString(2));
				rd.setEmail(rs.getString(3));
				rd.setPassword(rs.getString(4));
				rd.setAddress(rs.getString(5));
				rd.setMobile(rs.getString(6));
				rd.setBranch(rs.getString(7));
				rd.setEno(rs.getString(8));
				return rd;				
			}			
		} catch (SQLException e) {
			
			System.out.println("Error"+e);
		}
		
		return rd;
	}
	

}
