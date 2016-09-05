package com.saf.jdbc_curd.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.saf.jdbc_curd.dto.Getset;
import com.saf.jdbc_curd.utility.Singleton;

public class Update_emp_record {
	
		int a;
		public int  Access_record(Getset g){
			
		
			int id = g.getId();
			int phone = g.getPhone();
			
			
			Singleton s = Singleton.getSingleeton();
			Connection con=s.getCon();
			System.out.println("update inside dao"+con);
			
			try {
				Statement st = con.createStatement();
				int  a = st.executeUpdate("update abc.table1 set phone="+phone+" where id="+id+"");
				
				if(a==1)
				{
					System.out.println("data updated");
					System.out.println("------------------------");

					
				}
				else{
					
					System.out.println("invalid input");
					System.out.println("------------------------");

					
				}
			
			} catch (SQLException e) {
				System.out.println("sql execption inside the dao"+e);
			}
			
			
			return a;
			
			
			
		}
			
			
			
			
			
			
			
			
			
			
		}
	

