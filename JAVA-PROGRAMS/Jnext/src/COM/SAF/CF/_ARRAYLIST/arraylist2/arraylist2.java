package COM.SAF.CF._ARRAYLIST.arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {

	public static void main(String[] args) {

		ArrayList<Object> lst =new ArrayList<Object>();
		ArrayList<String> lst1=new ArrayList<String>();
		ArrayList<Integer> lst2=new ArrayList<Integer>();
		ArrayList<Object> lst3 =new ArrayList<Object>();




		Scanner s=new Scanner(System.in);

		System.out.println("String value is:");
		for(int j=0;j<5;j++){


			lst.add(s.next());

		}
		System.out.println("integer value is:");
		for(int i=0;i<5;i++){

			lst.add(s.nextInt());

		}

		System.out.println("arraylist is:");
		for(Object s1:lst){

			System.out.println(s1);


		}

		lst.set(2, "sarfaraz");
		lst.set(3, 3);

		System.out.println("NEW arraylist is:");

		for(Object s1:lst){

			System.out.println(s1);


		}


		lst.add(3, "mahir");

		System.out.println("NEW arraylist is:");

		for(Object s1:lst){

			System.out.println(s1);


		}

		if(lst.isEmpty()){

			System.out.println(true);

		}
		else{
			System.out.println(false);
		}

		System.out.println(lst.indexOf("sarfaraz")); 
		System.out.println(lst.remove(3));


		System.out.println("NEW arraylist is:");

		for(Object s1:lst){

			System.out.println(s1);
		}
		
		
		lst1.add("saf");
		lst1.add("nik");
		
		
		lst2.add(1);
		lst2.add(2);
	
		
		lst3.addAll(lst1);
		lst3.addAll(lst2);
		
		System.out.println("Arraylist is:");


		for(Object s1:lst3){

			System.out.println(s1);
		}
		
		




	}


}
