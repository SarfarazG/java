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
		
		ar.add(new Car("ROYALS","Black",5000000));
		ar.addAll(hs);
		
		System.out.println("answer is");
	
		Collections.sort(ar);
		for(Car c2:ar){
			
			
			System.out.println(c2.Brand+" "+c2.clr+" "+c2.Price);
			
		}
		
		

		
		
		
		
		
	}

}
