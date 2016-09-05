package COM.SAF.TASK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {





		Scanner x=new Scanner(System.in);
		System.out.println("Enter your Choice: 1-Mobile__2-Fan__ 3-Laptop");
		
		ArrayList<Commonclass> ar=new ArrayList<Commonclass>();
		HashSet<Commonclass> hs=new HashSet<Commonclass>();
		
		try {
		int i=x.nextInt();
		
		System.out.println("Entee the number of object u want to insert:");
		int l=x.nextInt();

		String m=x.next();
		String n=x.next();
		int  o=x.nextInt();

		switch (i) {
		case 1:
			
			for(int k=0;k<=l;k++){
				
				
				Mobile m1=new Mobile(m, o, n);
				hs.add(m1);
				
				
			}
			/*hs.add(l.new Mobile("Nokia",10000,"white"));
			hs.add(new Mobile("Samsung",30000,"Black"));
			hs.add(new Mobile("Lg",15000,"Grey"));
			hs.add(new Mobile("Nokia",10000,"white"));
			break; */   // add object though iterator
					//	whole program in for loop for second acess
		case 2:

			hs.add(new Fan("Orpat",1500,"white"));
			hs.add(new Fan("Usha",1000,"Black"));
			hs.add(new Fan("Phililps",3000,"Brown"));
			hs.add(new Fan("Orpat",1500,"white"));
			break;

		case 3:
			hs.add(new Laptop("Dell",50000,"white"));
			hs.add(new Laptop("Lenovo",300000,"Black"));
			hs.add(new Laptop("Hp",32000,"Brown"));
			hs.add(new Laptop("Dell",50000,"white"));

		default:
			System.out.println("Enter valid choice:");
			break;
		}
		}
	catch (Exception e) {
		System.out.println("enter only integer value");
	}
		
		ar.addAll(hs);
		
		Collections.sort(ar);
		
		System.out.println("Based on the price the list is as follow:");
		for(Commonclass c:ar){
			
			
			System.out.println(c.Brand+" "+c.clr+" "+c.price);
			
		}
		
		
		
		




	}





}
