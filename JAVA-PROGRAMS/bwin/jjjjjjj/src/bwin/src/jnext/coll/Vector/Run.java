package jnext.coll.Vector;


import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;


public class Run {
	public static void main(String[] args) {
      Vector<Moblie> lst =new Vector<Moblie>();	
      Moblie m=new Moblie("njee",8686,"lava");
      Moblie m1 =new Moblie("sony",7437,"sony");
      Moblie m2=new Moblie("pink",898999,"nokia");
      lst.add(m);
      lst.add(m1);
      lst.add(m2);
       Comparator<Moblie> ctr=new Baseoncolour();
      Collections.sort(lst,ctr);
      for(Moblie m111:lst){
    	 System.out.println(m111.brand);
      }
      
      
      
      
	}

}

