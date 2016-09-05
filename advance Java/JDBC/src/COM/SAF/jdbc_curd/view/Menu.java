package COM.SAF.jdbc_curd.view;

import java.util.Scanner;

import COM.SAF.jdbc_curd.controller.*;
import COM.SAF.jdbc_curd.dao.Show_emp_all_record;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------SWAGAT NAHI KAROGE HAMARA---------------------");
		for(int n=0;n<=20;n++){
		System.out.println("Press 1 to insert the data:");
		System.out.println("Press 2 to update the data:");
		System.out.println("Press 3 to delete the data:");
		System.out.println("Press 4 to show the data of specific person:");
		System.out.println("Press 5 to show the data of Every person::");
		System.out.println("Press 6 to exit:");

		System.out.println("------------------------");

		

		int select = sc.nextInt();
		switch (select) {
		case 1:
			
			insertt_emp_detail ied = new insertt_emp_detail();
			ied.collectdata();
			
			break;
			
		case 2:
			Update_emp_detail ued = new Update_emp_detail();
			ued.collectdata();
			break;
	
		case 3:
			delete_emp_detail  de = new delete_emp_detail();
			de.collectdata();
			break;
			
		case 4:
			Show_emp_detail se = new Show_emp_detail();
			se.collect_data();
			break;
		case 5:
			Show_emp_all_record sr = new Show_emp_all_record();
			sr.Access_record();
			break;
		case 6:
			
			break;
			
		}
		
		if(select == 6){
			System.out.println("bye_bye");
			break;
		}

	}
	
	
	
	
	
	
		
		
		
		

}
}