package COM.SAF.CF.SET.Hashset.H6.Hashset.h3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;


public class Run {
	
	
	public static void main(String[] args) {
		
		HashSet<Car> hs=new HashSet<Car>();
		ArrayList<Car> ar=new ArrayList<Car>();

		Car c1=new Car("BMW","BLACK",1);
		Car c2=new Car("MERCEDIES","WHITE",2);
		Car c3=new Car("SCKODA","BLACK",3);
		Car c4=new Car("AUDI","GREY",4);
		Car c5=new Car("MARUTI","BLACK",5);
		Car c6=new Car("ROYALS","WHITE",7);
		Car c7=new Car("Bmw","WHITE",7);
		
		
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);
		hs.add(c6);
		hs.add(c7);
		
		
		System.out.println("HASHCODE ARE ASS FOLLOW:");
		System.out.println("HC OF C1:"+c1.hashCode());
		System.out.println("HC OF C2:"+c2.hashCode());
		System.out.println("HC OF C3:"+c3.hashCode());
		System.out.println("HC OF C4:"+c4.hashCode());
		System.out.println("HC OF C5:"+c5.hashCode());
		System.out.println("HC OF C6:"+c6.hashCode());
		System.out.println("HC OF C7:"+c7.hashCode());
		
		ar.addAll(hs);
		Comparator<Car> cpr=new Basedonprice(); 
		Collections.sort(ar,cpr);	
		for(Car m3:ar){
			
			System.out.println(m3.Brand+"  "+m3.clr+"  "+m3.Price);
		}		

		
	}
	}