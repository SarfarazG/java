package com.saf.jdbc_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.saf.jdbc_bank.dto.Getset;
import com.saf.jdbc_bank.utiliy.Singleton;

public class Create_new_acnt_dao {
	
	int a;
	public int Access_record(Getset g){
		
		long ac = g.getAccount_no();
		int pass = g.getPass();
		String name = g.getName();
		double bal = g.getBalance();
		
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into bank.table1 values(?,?,?,?)");
			
			pstmt.setLong(1, ac);
			pstmt.setInt(2, pass);
			pstmt.setString(3, name);
			pstmt.setDouble(4, bal);
			
		int a = pstmt. executeUpdate();
		
		if(a==1){
			
			System.out.println("New account created:");
		}
		else{
			
			System.out.println("bhai kaik bhul che ");
			
		}
			
			
		} catch (SQLException e) {
			
			System.out.println("inside dao "+e);
			
		}
		
		
		return a;
		
		
	}
	
	
	
	
	

}
