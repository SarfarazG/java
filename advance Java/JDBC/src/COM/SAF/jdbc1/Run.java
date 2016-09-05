package COM.SAF.jdbc1;
import static COM.SAF.jdbc1.Initialize1.*;
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
				System.out.println("==============================================");
				int i = rs.getInt(4);
				System.out.println("salary:"+i);
				
				String j = rs.getString(2);
				System.out.println("name:"+j);
				
				String k = rs.getString(3);
				System.out.println("email:"+k);
				System.out.println("==============================================");
				
				
			}
			

		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}
