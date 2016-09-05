package COM.SAF.CF._ARRAYLIST.ARRAYLIST4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Run {


	public static void main(String[] args) {

		ArrayList<Mobile> ar=new ArrayList<Mobile>();

		ar.add(new Mobile("Samsung","white",1000));
		ar.add(new Mobile("Nokia","Black",2000));
		ar.add(new Mobile("Sony","Grey",20000));
		ar.add(new Mobile("Lava","Red",5000));
		ar.add(new Mobile("Intex","Blue",30000));
		ar.add(new Mobile("Micromax","Yellow",25000));
		ar.add(new Mobile("Motorola","Black",28000));
		ar.add(new Mobile("Blackberry","Pink",35000));
		ar.add(new Mobile("Iphone","White",50000));

		Comparator<Mobile> cpr =new Base_on_price();
		Comparator<Mobile> cpr1 =new Base_on_clr();
		Comparator<Mobile> cpr2 =new Base_on_name();



		Collections.sort(ar,cpr);
		System.out.println("-------------------------------------------------------------");
		System.out.println("BASED ON PRICE ");
		System.out.println("-------------------------------------------------------------");

		for(Mobile m3:ar){

			System.out.println(m3.name+"  "+m3.clr+"  "+m3.price);

		}

		


		Collections.sort(ar,cpr1);
		System.out.println("-------------------------------------------------------------");
		System.out.println("BASED ON CLR");
		System.out.println("------------------S------------------------------------------");

		for(Mobile m3:ar){

			System.out.println(m3.name+"  "+m3.clr+"  "+m3.price);

		}


		Collections.sort(ar,cpr2);
		System.out.println("-------------------------------------------------------------");
		System.out.println("BASED ON NAME ");
		System.out.println("-------------------------------------------------------------");

		for(Mobile m3:ar){

			System.out.println(m3.name+"  "+m3.clr+"  "+m3.price);

		}





	}

}
