package COM.SAF.jdbc_bank.controller;

import java.util.Scanner;

import COM.SAF.jdbc_bank.dao.Show_record;
import COM.SAF.jdbc_bank.dto.*;

public class Show_detail {
	
	
	public void collect_data(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account no:");
		long ac = sc.nextLong();
		
		Getset g = new Getset();
		
		g.setAccount_no(ac);
		
		Show_record sr = new Show_record();
		sr.Access_record(g);
		
		
	}
	

}
