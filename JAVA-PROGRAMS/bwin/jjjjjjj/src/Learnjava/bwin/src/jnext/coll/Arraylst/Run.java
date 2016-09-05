package jnext.coll.Arraylst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Run {
	public static void main(String[] args) {
		ArrayList<Moblie> lst=new ArrayList<Moblie>();
       Moblie m=new Moblie("red",9999);
       Moblie m1 =new Moblie("blaCK",6437);
        Moblie m2=new Moblie("pink",7789);
         lst.add(m);
         lst.add(m1);
         lst.add(m2);
         
         Collections.sort(lst);
      for(Moblie i:lst){
    	  System.out.println(i.price+i.colour);
    	  
      }
  
	
       	
	
	
	}

}
