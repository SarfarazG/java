package com.saf.mailling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.saf.mailling.dto.RegDto;
import com.saf.mailling.uitility.Singleton;

public class EditProfileDao {
	
	public int EditProfile_Query(RegDto rd2){
		
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		System.out.println("Address:"+rd2.getAddress());
		try {
			PreparedStatement pstmt = con.prepareStatement("update mailing.regester set NAME=?,EMAIL=?,ADDRESS=?,MOBILE=?,BRANCH=?,ENROLLMENT_NO=?");
			pstmt.setString(1,rd2.getName());
			pstmt.setString(2, rd2.getEmail());
			pstmt.setString(3, rd2.getAddress());
			pstmt.setString(4, rd2.getMobile());
			pstmt.setString(5, rd2.getBranch());
			pstmt.setString(6, rd2.getEno());
			
			int a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("succesfully updated");
				return 1;
			}
			else{
				System.out.println("unsuccesfull");
				return 0;
			}
			
		} catch (SQLException e) {
		System.out.println("Error in sql"+e);			
		}
		
		return 0;
	}
	

}
