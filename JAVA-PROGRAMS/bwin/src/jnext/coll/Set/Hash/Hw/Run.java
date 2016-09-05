package jnext.coll.Set.Hash.Hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Run {
 public static void main(String[] args) {
	HashSet<Car> hs=new HashSet<Car>();
	 hs.add(new Car("red","tata",99000));
	 hs.add(new Car("pink","honda",90000));
	 hs.add(new Car("black","honda",88000));
	 hs.add(new Car("pink","audi",509000));
	 ArrayList<Car> lst=new ArrayList<Car>();
	 
	 lst.addAll(hs);
//	 Collections.sort(lst);
	 for(Car c:lst){
		 System.out.println(c.brand);
	 }
}
}
