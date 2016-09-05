package COM.SAF.jdbc_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import COM.SAF.jdbc_bank.dto.Getset;
import COM.SAF.jdbc_bank.utiliy.Singleton;



public class Delete_aca_dao {
	
	
	int a;
	public int Access_record(Getset g){
		
		long ac = g.getAccount_no();
		
		Singleton s = Singleton.getS();
		Connection con = s.getCon();
		try {
			PreparedStatement pstmt = con.prepareStatement("delete from bank.table1 where Account_No=?");
			pstmt.setLong(1, ac);
			int a = pstmt.executeUpdate();
			
			if(a==1){
				
				System.out.println("Account deleted:");
				System.out.println("------------------------");

			}
			else{
			
				System.out.println("bhai kaik bhul che:");
				System.out.println("------------------------");

			}
			
			
		} catch (SQLException e) {
			System.out.println("sql execption inside delete of dao "+e);
		}
		
		return a;
		
		
	}
	

}
