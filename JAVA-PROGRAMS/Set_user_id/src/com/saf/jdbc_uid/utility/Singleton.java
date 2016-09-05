package com.saf.jdbc_uid.utility;

import static com.saf.jdbc_uid.utility.Initialize.*;

import java.sql.*;

public class Singleton {
	
	
	private static final Singleton s = new Singleton();
	
	private Connection con;
	
	private Singleton(){
		
	try {
		Class.forName(Driv);
		con=DriverManager.getConnection(url,user,pass);
		System.out.println(con);
		
	} catch (ClassNotFoundException e) {
		System.out.println("class not found exception inside singleton"+e);
	} catch (SQLException e) {
		System.out.println(" SQLException exception inside singleton"+e);

	}
		
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public static Singleton getSingleeton() {
		return s;
	}
	
	
	
	

}
