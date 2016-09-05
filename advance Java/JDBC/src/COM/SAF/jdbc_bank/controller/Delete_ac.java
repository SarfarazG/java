package COM.SAF.jdbc_bank.controller;

import java.util.Scanner;

import COM.SAF.jdbc_bank.dao.Delete_aca_dao;
import COM.SAF.jdbc_bank.dto.Getset;



public class Delete_ac {
	
	public void collectdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Account no:");
		long i = sc.nextLong();
		
		Getset g = new Getset();
		 g.setAccount_no(i);
		
		Delete_aca_dao da = new Delete_aca_dao();
		int a = da.Access_record(g);
		
		
		}
}
