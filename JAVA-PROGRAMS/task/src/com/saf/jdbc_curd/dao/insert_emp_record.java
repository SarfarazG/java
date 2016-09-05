package com.saf.jdbc_curd.dao;

import java.sql.*;

import com.saf.jdbc_curd.utility.Singleton;
import com.saf.jdbc_curd.controller.*;
import com.saf.jdbc_curd.dto.*;

public class insert_emp_record  {
	int a;

	public int Access_record(Getset g){
		
		int id = g.getId();
		String name = g.getName();
		String email = g.getEmail();
		double salary = g.getSalary();
		int phone =g.getPhone();
		
		
		Singleton s = Singleton.getSingleeton();
		Connection con=s.getCon();
		System.out.println("insert inside dao"+con);
		
		try {
			Statement st = con.createStatement();
			 a = st.executeUpdate("insert into abc.table1 values("+id+",'"+name+"','"+email+"',"+salary+","+phone+")");
			
			if(a==1)
			{
				System.out.println("data inserted");
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
