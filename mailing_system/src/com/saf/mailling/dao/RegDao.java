package com.saf.mailling.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.saf.mailling.uitility.Singleton;

import com.saf.mailling.dto.RegDto;

public class RegDao {

	int a;
	public int Access_record(RegDto g2){
		
		String Eno = g2.getEno();
		String mobile = g2.getMobile();
		String email = g2.getEmail();
		String branch = g2.getBranch();
		String name = g2.getName();
		String address = g2.getAddress();
		String password = g2.getPassword();
		
		
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into mailing.regester (NAME,EMAIL,PASSWORD,ADDRESS,MOBILE,BRANCH,ENROLLMENT_NO)values(?,?,?,?,?,?,?)");
			pstmt.setString(1,name);
			pstmt.setString(2, email);
			pstmt.setString(3,password);
			pstmt.setString(4, address);
			pstmt.setString(5,mobile);
			pstmt.setString(6,branch);
			pstmt.setString(7,Eno);

			 a = pstmt.executeUpdate();
		
		if(a>0){
			System.out.println("data succesfully entered in reg table");
			PreparedStatement pstmt2 = con.prepareStatement("insert into mailing.login (NAME,PASSWORD,EMAIL,CODE,ACTIVATION)values(?,?,?,?,?)");
			pstmt2.setString(1, name);
			pstmt2.setString(2, password);
			pstmt2.setString(3, email);
			pstmt2.setString(4, g2.getCode());
			pstmt2.setString(5, "off");	
			a = pstmt2.executeUpdate();
			if(a>0){
				System.out.println("data succesfully enterd in login table");
				return a;
			}else{
				System.out.println("error in entering data in  logion table");
				
			}
		}
		else{
			
			System.out.println("Error in entering data in register table ");
			
		}
			
			
		} catch (SQLException e) {
			
			System.out.println("inside dao "+e);
			
		}
		
		return 0;	
		
	}
	
	
}
