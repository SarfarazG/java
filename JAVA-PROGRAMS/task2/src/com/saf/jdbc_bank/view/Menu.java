package com.saf.jdbc_bank.view;

import java.util.Scanner;

import com.saf.jdbc_bank.controller.Create_new_acnt;
import com.saf.jdbc_bank.controller.Credit_money;
import com.saf.jdbc_bank.controller.Delete_ac;
import com.saf.jdbc_bank.controller.Show_detail;
import com.saf.jdbc_bank.controller.Withdraw_money;
import com.saf.jdbc_bank.dao.Create_new_acnt_dao;
import com.saf.jdbc_bank.dao.Delete_aca_dao;

public class Menu {
	
	public static void main(String[] args) {
		
	for(int i=0;i<=30000;i++){
		System.out.println("Press 1 to create a new account:");
		System.out.println("Press 2 to delete the account:");
		System.out.println("Press 3 to show the account details:");
		System.out.println("Press 4 to withdraw Amount:");
		System.out.println("Press 5 to credit Amount:");



		System.out.println("Press 8 to exit:");

		Scanner sc = new Scanner(System.in);
		int selct = sc.nextInt();
	
		switch (selct) {
	
			case 1:
				Create_new_acnt ca = new Create_new_acnt();
				ca.collect_data();
				break;
				
			case 2:
					Delete_ac da = new Delete_ac();
					da.collectdata();
					break;
			case 3:
					Show_detail sd = new Show_detail();
					sd.collect_data();
					break;
					
			case 4:
					Withdraw_money wm = new Withdraw_money();
					wm.collect_data();
					break;
				
			case 5:
					Credit_money cm = new Credit_money();
					cm.collect_data();
					break;
			case 8:
				break;

			default:
				break;
		}

			if(selct==8){
				
				System.out.println("thank-you for your visit");
				break;

			}
	
	}	
	}
}
