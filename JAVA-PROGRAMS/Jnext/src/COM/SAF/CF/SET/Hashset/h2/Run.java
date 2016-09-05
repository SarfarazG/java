package COM.SAF.CF.SET.Hashset.h2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Run {
	
	
	public static void main(String[] args) {
		
		HashSet<Car> hs=new HashSet<Car>();
		ArrayList<Car> ar=new ArrayList<Car>();

		
		hs.add(new Car("BMW","BLACK",2000000));
		hs.add(new Car("MERCEDIES","WHITE",2500000));
		hs.add(new Car("SCKODA","BLACK",1050000));
		hs.add(new Car("AUDI","GREY",3500000));
		hs.add(new Car("MARUTI","BLACK",500000));
		hs.add(new Car("ROYALS","WHITE",5000000));
		hs.add(new Car("ROLLS-ROYCE","WHITE",5000000)); // UNIQUNESS IS NOT MAINTAINED HERE IN THE USERDEFIEND CLASS "I.E(CAR)"
		
	
		ar.addAll(hs);    //the whole set is added in ARRAYLIST for "SORTING"
		
		System.out.println("SORTING  USING COMPARABLE ");
		System.out.println("answer is");
	
		Collections.sort(ar);
		for(Car c2:ar){
			
			
			System.out.println(c2.Brand+" "+c2.clr+" "+c2.Price);
			
		}
		
		

		
		
		
		
		
	}

}
