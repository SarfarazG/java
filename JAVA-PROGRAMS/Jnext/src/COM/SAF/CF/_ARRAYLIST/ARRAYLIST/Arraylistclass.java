package COM.SAF.CF._ARRAYLIST.ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;


public class Arraylistclass {

	public static void main(String[] args) {

		ArrayList<String> lst =new ArrayList<String>();


		lst.add("abc");
		lst.add("Bcd");
		lst.add("def");
		
	

		Collections.sort(lst);
		System.out.println("NEW arraylist is:");

		for(Object s1:lst){

			System.out.println(s1);


		}



	}



}
