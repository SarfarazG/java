package COM.SAF.jdbc_curd.controller;

import java.util.Scanner;

import COM.SAF.jdbc_curd.dao.delete_emp_record;
import COM.SAF.jdbc_curd.dto.Getset;

public class delete_emp_detail {
	
	public void collectdata(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your id:");
	int i = sc.nextInt();
	
	Getset g = new Getset();
	 g.setId(i);
	
	delete_emp_record dr = new delete_emp_record();
	int a = dr.Access_record(g);
	
	
	}
}
