package COM.SAF.jdbc_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import COM.SAF.jdbc_bank.dto.Getset;
import COM.SAF.jdbc_bank.utiliy.Singleton;

public class Credit_dao {
	
	
	int a;
	public int Access_Record(Getset g){
		
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		double credit = sc.nextInt();
	
		try {
			PreparedStatement pstmt = con.prepareStatement("update bank.table1 set Balance=Balance+? where Name=? And Password=?");
			
			pstmt.setDouble(1, credit);
			pstmt.setString(2, g.getName());
			pstmt.setInt(3, g.getPass());
			
			
			
			int a= pstmt.executeUpdate();
			
			if(a==1){
				
				System.out.println("your Balance has updated");
				
			}
			else{
				
				
				System.out.println("kaik bhul che baka");
			}
			
		} catch (SQLException e) {
			
			System.out.println("inside dao "+e);
		}
		
		return a;
		
		
		
		
		
		
		
		
	}
	

}
