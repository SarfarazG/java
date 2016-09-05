package com.saf.jdbc1;
import static com.saf.jdbc1.Initialize1.*;
import java.sql.*;

public class Run {

	public static void main(String[] args) {
		try {
			Class.forName(Driv);
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println(con);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from abc.ab"); 
			System.out.println(rs);
			while(rs.next()){
				
				int i = rs.getInt(2);
				System.out.println("phone"+i);
				
				String j = rs.getString(1);
				System.out.println("name:"+j);
				
				String k = rs.getString(3);
				System.out.println("address:"+k);
				
				
			}
			

		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}
