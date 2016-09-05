package jnext.coll.Arraylst.Linklist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Run {
	public static void main(String[] args) {
      LinkedList<Moblie> lst =new LinkedList<Moblie>();	
      Moblie m=new Moblie("nree",8686,"lava");
      Moblie m1 =new Moblie("sony",7437,"sony");
      Moblie m2=new Moblie("pink",898999,"nokia");
      lst.add(m);
      lst.add(m1);
      lst.add(m2);
       Comparator<Moblie> ctr=new Baseonbrand();
      Collections.sort(lst,ctr);
      for(Moblie m111:lst){
    	 System.out.println(m111.brand);
      }
      
      
      
      
	}

}
