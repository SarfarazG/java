package com.saf.jdbc_curd.controller;

import java.util.Scanner;

import com.saf.jdbc_curd.dao.Update_emp_record;
import com.saf.jdbc_curd.dao.insert_emp_record;
import com.saf.jdbc_curd.dto.Getset;

public class Update_emp_detail {
	
	public void collectdata(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id = sc.nextInt();
		
		System.out.println("Enter your phone number");
		int phone = sc.nextInt();
		
		Getset g = new Getset();
		
		g.setId(id);
		g.setPhone(phone);
	
		Update_emp_record ue = new Update_emp_record();
		int a = ue.Access_record(g);
	
	
	}
}
