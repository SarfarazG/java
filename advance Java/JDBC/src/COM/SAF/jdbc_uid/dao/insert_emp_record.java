package COM.SAF.jdbc_uid.dao;

import java.sql.*;

import COM.SAF.jdbc_uid.utility.Singleton;
//import com.saf.jdbc_uid.controller.*;
import COM.SAF.jdbc_uid.dto.*;

public class insert_emp_record  {
	int a;

	public int Access_record(Getset g){
		
	
		String name = g.getName();
		String pass = g.getPassword();
		String email = g.getEmail();
		String address = g.getAddress();
		int phone =g.getPhone();
		
		String b1= Integer.toString(phone);
		double d =Math.random();
		String b2 = Double.toString(d);
		String a1= name.substring(0, 1)+pass.substring(0, 1)+email.substring(0, 1)+b1.substring(0, 1)+address.substring(0, 1)+b2.substring(6, 9);	
		Singleton s = Singleton.getSingleeton();
		Connection con=s.getCon();
		System.out.println("insert inside dao"+con);
		
		try {
			Statement st = con.createStatement();
			int a = st.executeUpdate("insert into abc.tab values('"+a1+"','"+name+"','"+pass+"','"+email+"',"+phone+",'"+address+"')");
			
			if(a==1)
			{
				System.out.println("your username is :"+a1);
				System.out.println("Your Password is : "+pass);
				System.out.println();
				System.out.println("------------------------");

				
			}
			else{
				
				System.out.println("invalid input");
				System.out.println("------------------------");

			}
		
		} catch (SQLException e) {
			System.out.println("sql execption inside the dao "+e);
		}
		
		
		return a;
		
		
		
	}
	

}
