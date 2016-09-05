package jnext.coll.Arraylst.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Run {
	public static void main(String[] args) {
		ArrayList<Moblie> lst=new ArrayList<Moblie>();
		  Moblie m=new Moblie("red",86896);
	      Moblie m1 =new Moblie("blaCK",7437);
	      Moblie m2=new Moblie("pink",8989);
	      lst.add(m);
	      lst.add(m1);
	      lst.add(m2);
	       Comparator<Moblie> ctr=new Baseprice();
	      Collections.sort(lst,ctr);
	      for(Moblie m111:lst){
	    	 System.out.println(m111.price);
	      }
	      
	}

}

