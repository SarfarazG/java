package COM.SAF.CF._ARRAYLIST.arraylist3;

import java.util.ArrayList;
import java.util.Collections;

public class Run {


	public static void main(String[] args) {


		ArrayList<Mobile> lst=new ArrayList<Mobile>();
		lst.add(new Mobile("Nokia","black",122000));
		lst.add(new Mobile("Sony","White",50000));
		lst.add(new Mobile("Samsung","Grey",1000));
		lst.add(new Mobile("Lava","laal",1200));
		lst.add(new Mobile("Nokia","black",122000));
		lst.add(new Mobile("Sony","White",50000));
		lst.add(new Mobile("Samsung","Grey",1000));
		lst.add(new Mobile("Lava","laal",1200));
		lst.add(new Mobile("Nokia","black",122000));
		lst.add(new Mobile("Sony","White",50000));
		lst.add(new Mobile("Samsung","Grey",1000));
		lst.add(new Mobile("Lava","laal",1200));
		lst.add(new Mobile("Nokia","black",122000));
		lst.add(new Mobile("Sony","White",50000));
		lst.add(new Mobile("Samsung","Grey",1000));
		lst.add(new Mobile("Lava","laal",1200));
		lst.add(new Mobile("Nokia","black",122000));
		lst.add(new Mobile("Sony","White",50000));
		lst.add(new Mobile("Samsung","Grey",1000));
		lst.add(new Mobile("Lava","laal",1200));


		System.out.println("-------------------------------------------------------------");
		System.out.println("BASED ON PRICE ANSWER IS:");
		System.out.println("-------------------------------------------------------------");
		//for(Mobile m:lst){

			//System.out.println(m.clr+"=="+m.name+"=="+m.pirce);


		//}

		Collections.sort(lst);
		System.out.println("-------------------------------------------------------------");
		System.out.println("BASED ON NAME:");
		System.out.println("SORTED PRICE VALUE IS:");
		System.out.println("-------------------------------------------------------------");
		for(Mobile m:lst){

			System.out.println(m.price);


		}

		Collections.sort(lst);
		System.out.println("-------------------------------------------------------------");
		System.out.println("SORTED ARRAY BASED ON NAME IS:");
		System.out.println("-------------------------------------------------------------");
		for(Mobile m:lst){

			System.out.println(m.name+" "+m.clr+" "+m.price);


		}










	}

}
