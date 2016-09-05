package com;

import java.util.ArrayList;
import java.util.Collections;

	public class Run {
	public static void main(String[] args) {
	 ArrayList<String> lst=new ArrayList<String> ();
		 
		 lst.add("abc");
		 lst.add("xy");
		 lst.add("wd"); 
		 lst.add("cd");
		 lst.add("op");
		 lst.add("iiii");
		 lst.add("jjjj");
		 lst.add("fyj");
		 lst.add("jjuj");
		 lst.add("hjij");
		 lst.add("jjhjij");
		 Collections.sort(lst);
		 for(String s:lst){
			 System.out.println(s);
		 }
		 
		 
		 
	}

	
	

}
