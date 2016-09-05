package com.saf.jdbc_curd.controller;

import java.util.Scanner;

import com.saf.jdbc_curd.dao.insert_emp_record;
import com.saf.jdbc_curd.dto.Getset;

public class insertt_emp_detail {
	
	
		public void collectdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();
		System.out.println("enter your phone number:");
		int phone = sc.nextInt();
		
		Getset g = new Getset();
		
		g.setId(id);
		g.setName(name);
		g.setEmail(email);
		g.setSalary(salary);
		g.setPhone(phone);
		
		insert_emp_record ie = new insert_emp_record();
		int a =ie.Access_record(g);
		
		
		}
		
		
		
	

}
