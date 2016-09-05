package com.saf.jdbc_uid.controller;

import java.util.Scanner;

import com.saf.jdbc_uid.dao.insert_emp_record;
import com.saf.jdbc_uid.dto.Getset;

public class insertt_emp_detail {
	
	
		public void collectdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your password");
		String pass = sc.next();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("enter your phone number:");
		int phone = sc.nextInt();
		System.out.println("Enter your address");
		String address = sc.next();
	
		
		Getset g = new Getset();
			
		g.setName(name);
		g.setPassword(pass);
		g.setEmail(email);
		g.setPhone(phone);
		g.setAddress(address);
		
		insert_emp_record ie = new insert_emp_record();
		int a =ie.Access_record(g);
		
		
		}
		
		
		
	

}
