package COM.SAF.jdbc_curd.dao;

import java.sql.*;

import COM.SAF.jdbc_curd.dto.Getset;
import COM.SAF.jdbc_curd.utility.Singleton;

public class delete_emp_record {
	
	int a;
	public int Access_record(Getset g){
		
		int id = g.getId();
		
		Singleton s = Singleton.getSingleeton();
		Connection con = s.getCon();
		try {
			Statement st = con.createStatement();
			int a = st.executeUpdate("delete from abc.table1 where id="+id+"");
			
			if(a==1){
				
				System.out.println("data deleted:");
				System.out.println("------------------------");

			}
			else{
			
				System.out.println("bhai kaik bhul che:");
				System.out.println("------------------------");

			}
			
			
		} catch (SQLException e) {
			System.out.println("sql execption inside delete of dao"+e);
		}
		
		return a;
		
		
	}
	
	
	

}
