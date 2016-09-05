package com.saf.jdbc_bank.controller;

import java.util.Scanner;

import com.saf.jdbc_bank.dao.Credit_dao;
import com.saf.jdbc_bank.dao.Withdraw_money_dao;
import com.saf.jdbc_bank.dto.Getset;

public class Credit_money {

	
	public void collect_data(){
		
		
		Getset g = new Getset();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name	= sc.next();
		System.out.println("Enter your Password:");
		int pass = sc.nextInt();
		
		g.setName(name);
		g.setPass(pass);
		
		Credit_dao cd= new Credit_dao();
		int a = cd.Access_Record(g);
		
		
		
		
		
		
		
		
	}
	
	
}
