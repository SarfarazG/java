package COM.SAF.jdbc_curd.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import COM.SAF.jdbc_curd.dto.Getset;
import COM.SAF.jdbc_curd.utility.Singleton;

public class Show_emp_all_record {
	
	public void Access_record(){

		Singleton s = Singleton.getSingleeton();
		Connection con = s.getCon();
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from abc.table1");
			
			while(rs.next()){

				int i = rs.getInt(1);
				System.out.println("id:"+i);
				
				String j = rs.getString(2);
				System.out.println("Name:"+j);
				
				String k = rs.getString(3);
				System.out.println("Email:"+k);
				
				double d = rs.getInt(4);
				System.out.println("Salary:"+d);
				
				int p = rs.getInt(5);
				System.out.println("Phone:"+p);
				
				System.out.println("-------------------------------------------------");
			}
			
		} catch (SQLException e) {
			System.out.println("inside show of dao "+e);
		}
		

			
			
			
			
			
		}
	
	
	

}
