package COM.SAF.CF.flipkart2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Run {

	public static void main(String[] args) {


		ArrayList<Commonclass>ar=new ArrayList<Commonclass>();
		HashSet<Commonclass> hs=new HashSet<Commonclass>();
	
		ar.add(new Mobile("Nokia", 10000, "White"));
		ar.add(new Mobile("Samsung", 20000, "Black"));
		ar.add(new Mobile("Sony", 15000, "Grey"));

		ar.add(new Fan("Orpat", 2000, "White"));
		ar.add(new Fan("Usha", 4000, "Brown"));
		ar.add(new Fan("Philips", 5000, "Grey"));



		ar.add(new Laptop("Dell", 45000, "White"));
		ar.add(new Laptop("Lenovo", 32000, "Black"));
		ar.add(new Laptop("Sony", 70000, "White"));


		ar.add(new Tv("Lg", 25000, "White"));
		ar.add(new Tv("Sony", 40000, "Black"));
		ar.add(new Tv("Sansui", 50000, "White"));




		Comparator<Commonclass> cpr=new Basedonprice(); 



		System.out.println("Electronics items sorted by Price is are as follow");

		Collections.sort(ar,cpr);
		for(Commonclass c2:ar){


			System.out.println(c2.Brand+"  "+c2.clr+"  "+c2.price);
		}



	}

}
