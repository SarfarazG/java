package COM.SAF.CF.SET.Hashset.h1;

import java.util.HashSet;

public class Run {
	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();


		hs.add("sarfaraz");
		hs.add("mahir");
		hs.add("sarfaraz");


		// UNIQUENESS IS MAINTAINED IN HASHSET WHEN THE ELEMENT IS  TAKEN AS(Integer,String,byte,short,long etc)
		// SORTING cant be achieved in hashset.
		// but it is possible by adding whole hashset in ARRAYLIST.
		// IT IS SHOWN IN HASHSET2

		for(String s:hs){

			System.out.println(s);


		}








	} 


}
