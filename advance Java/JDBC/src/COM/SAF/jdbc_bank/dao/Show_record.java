package COM.SAF.jdbc_bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import COM.SAF.jdbc_bank.dto.Getset;
import COM.SAF.jdbc_bank.utiliy.Singleton;

public class Show_record {
	
	public void Access_record(Getset g){

		Singleton s = Singleton.getS();
		Connection con = s.getCon();
	long l = g.getAccount_no();
		
		try {
			PreparedStatement  pstmt = con.prepareStatement("select * from bank.table1 where Account_no=?");
			pstmt.setLong(1, l);
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()){

				long i = rs.getLong(1);
				System.out.println("Account_No:"+i);
				
				int p = rs.getInt(2);
				System.out.println("Password:"+p);
				
				String j = rs.getString(3);
				System.out.println("Name:"+j);
				
				double k = rs.getDouble(4);
				System.out.println("Balance:"+k);
							
				System.out.println("-------------------------------------------------");
			}
			
		} catch (SQLException e) {
			System.out.println("inside show of dao "+e);
		}
		

			
			
			
			
			
		}

}
