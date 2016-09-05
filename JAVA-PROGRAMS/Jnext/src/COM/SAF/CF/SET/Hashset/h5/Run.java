package COM.SAF.CF.SET.Hashset.h5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import COM.SAF.CF.flipkart2.Basedonprice;


public class Run {


	public static void main(String[] args) {

		HashSet<Electronics> hs=new HashSet<Electronics>();
		ArrayList<Electronics> ar=new ArrayList<Electronics>();

		
		hs.add(new Mobile("Nokia", 10000, "White"));
		hs.add(new Mobile("Nokia", 10000, "White"));
		hs.add(new Mobile("Samsung", 20000, "Black"));
		hs.add(new Mobile("Sony", 15000, "Grey"));

		hs.add(new Fan("Orpat", 2000, "White"));
		hs.add(new Fan("Orpat", 2000, "White"));
		hs.add(new Fan("Usha", 4000, "Brown"));
		hs.add(new Fan("Philips", 5000, "Grey"));



		hs.add(new Laptop("Dell", 45000, "White"));
		hs.add(new Laptop("Dell", 45000, "White"));
		hs.add(new Laptop("Lenovo", 32000, "Black"));
		hs.add(new Laptop("Sony", 70000, "White"));


		hs.add(new Tv("Lg", 25000, "White"));
		hs.add(new Tv("Lg", 25000, "White"));
		hs.add(new Tv("Sony", 40000, "Black"));
		hs.add(new Tv("Sansui", 50000, "White")); // UNIQUNESS IS NOT MAINTAINED HERE IN THE USERDEFIEND CLASS "I.E(CAR)"


		ar.addAll(hs);    //the whole set is added in ARRAYLIST for "SORTING"

		Comparator<Electronics> cpt =new Baseonprice();
		


		System.out.println("SORTING  USING COMPARTER ");
		System.out.println("ANSWER IS:");

		Collections.sort(ar,cpt);
		System.out.println("====================================================================================");
		System.out.println("SORTING BASED ON PRICE:");
		System.out.println("====================================================================================");

		for(Electronics c2:ar){


			System.out.println(c2.brand+" "+c2.clr+" "+c2.price);

		}
		
		Comparator<Electronics> cpt2 =new Baseonbrand();
		Collections.sort(ar,cpt2);
		
		System.out.println("====================================================================================");
		System.out.println("SORTING BASED ON BRAND:");
		System.out.println("====================================================================================");

		for(Electronics c2:ar){


			System.out.println(c2.brand+" "+c2.clr+" "+c2.price);

		}
		
		Comparator<Electronics> cpt3 =new Baseoncolour();

		Collections.sort(ar,cpt3);
		System.out.println("====================================================================================");
		System.out.println("SORTING BASED ON PRICE:");
		System.out.println("====================================================================================");

		for(Electronics c2:ar){


			System.out.println(c2.brand+" "+c2.clr+" "+c2.price);

		}







	}

}
