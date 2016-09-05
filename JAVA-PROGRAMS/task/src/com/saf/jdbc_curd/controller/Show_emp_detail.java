package com.saf.jdbc_curd.controller;

import java.util.Scanner;

import com.saf.jdbc_curd.dao.Show_emp_record;
import com.saf.jdbc_curd.dto.Getset;

public class Show_emp_detail {
	
	
	public void collect_data(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of person:");
		String name = sc.next();
		
		Getset g = new Getset();
		
		g.setName(name);
		
		Show_emp_record sr = new Show_emp_record();
		sr.Access_record(g);
		
		
	}
	
	
	
	
	
	
	
	

}
