package com.saf.mailling.uitility;


import static com.saf.mailling.uitility.Initialize.*;

import java.sql.*;

public class Singleton {
	
	
	private static final Singleton s = new Singleton();
	private Connection con;
	
	private Singleton(){	
		try {
			Class.forName(Driv);
			con = DriverManager.getConnection(url, user, pass);
			
		} catch (Exception  e) {
		
			System.out.println("inside the singleton "+e);		
		}	
		
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public static Singleton getS() {
		return s;
	}
}
