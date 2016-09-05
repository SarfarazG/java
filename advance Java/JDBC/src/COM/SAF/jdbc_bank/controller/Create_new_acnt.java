package COM.SAF.jdbc_bank.controller;

import java.util.Scanner;

import COM.SAF.jdbc_bank.dao.Create_new_acnt_dao;
import COM.SAF.jdbc_bank.dto.Getset;

public class Create_new_acnt {
	
	
	public void collect_data(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your account number:");
		long Account_no = sc.nextLong();
		System.out.println("Enter your Pasword:");
		int Password = sc.nextInt();
		System.out.println("Enter your Name:");
		String Name = sc.next();
		
		final double Balance=1000;
		
		
		Getset g = new Getset();
		 g.setAccount_no(Account_no);
		 g.setName(Name);
		 g.setPass(Password);
		 g.setBalance(Balance);
		 
		 
		 Create_new_acnt_dao cd = new Create_new_acnt_dao();
		 int a = cd.Access_record(g);
	
		
		
	}
	
	
	
	

}
