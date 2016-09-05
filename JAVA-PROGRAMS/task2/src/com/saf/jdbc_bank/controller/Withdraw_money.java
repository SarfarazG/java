package com.saf.jdbc_bank.controller;

import java.util.Scanner;

import com.saf.jdbc_bank.dao.Withdraw_money_dao;
import com.saf.jdbc_bank.dto.Getset;

public class Withdraw_money {
	
	
	public void collect_data(){
		
		
		Getset g = new Getset();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name	= sc.next();
		System.out.println("Enter your Password:");
		int pass = sc.nextInt();
		
		
	
		
		g.setName(name);
		g.setPass(pass);
		
		Withdraw_money_dao wm = new Withdraw_money_dao();
		int a = wm.Access_Record(g);
		
		/*g.setBalance(b);
		System.out.println("Enter the Amount:");
		double withdraw = sc.nextInt();
				
				
		double b=(g.getBalance()- withdraw);
		
		if(g.getBalance()>=1000){
			
			Withdraw_money_dao wm = new Withdraw_money_dao();
			int a = wm.Access_Record(g);
	
		}
		else{
			
			System.out.println("Alert: you must keep your balance to 1000 rs");
			
		}*/
			

				
	}
	
	
	
	
	
	

}
