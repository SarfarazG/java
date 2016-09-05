package com.saf.jdbc2;
import static com.saf.jdbc1.Initialize1.*;
import java.sql.*;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your details here:");
		
		//String u = sc.next();
		int i=sc.nextInt();
		//String em= sc.next();
		
		
		try {
			Class.forName(Driv);
			Connection con=DriverManager.getConnection(url,user,pass);
			//System.out.println(con);
			Statement st = con.createStatement();
			
			//String query="select * from abc.ab where id="+i+"";
			//String query1="insert into abc.ab values("+i+",'"+u+"','"+em+"')";
			//String query2="update abc.ab set name='"+u+"' where id="+i+"";
			String query3="delete from abc.ab where ID="+i+" ";
			
			//ResultSet rs = st.executeQuery(query1); 
			int rs =st.executeUpdate(query3);
			//System.out.println(rs);
			
			/*if(rs.next()){
				
				int p = rs.getInt(1);
				System.out.println("ID:"+p);
				
				String j = rs.getString("name");
				System.out.println("NAME:"+j);
				
				String k = rs.getString(3);
				System.out.println("Email:"+k);
							
			}
			else{
				
				System.out.println("user name or password is invalid");
			}*/
			
			if(rs==1){
				
				System.out.println("data inserted");
			}
			else {
				System.out.println("invalid input");
			}

		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}
