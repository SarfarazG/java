package jnext.coll.Arraylst.Electronics;

import java.util.ArrayList;
import java.util.Collections;

import jnext.coll.Arraylst.Moblie;

public class Run {
	public static void main(String[] args) {
		ArrayList<Electronics> lst=new ArrayList<Electronics>();
		 Fan f=new Fan("orpet","red",9999);
	     Fan f1=new Fan("havel","blaCK",6437);
	     Fan f2=new Fan("Luminus","pink",7789);
	         lst.add(f);
	         lst.add(f1);
	         lst.add(f2);
	         Laptop m=new Laptop("red",9999);
	         Laptop m1 =new Laptop("blaCK",6437);
	         Laptop m2=new Laptop("pink",7789);
	           lst.add(m);
	           lst.add(m1);
	           lst.add(m2);
	           Computer c=new Computer("asus",9999);
	           Computer c1 =new Computer("sony",6437);
	           Computer c2=new Computer("gdujdsjh",7789);
	             lst.add(c);
	             lst.add(c1);
	             lst.add(c2);
	          Collections.sort(lst);
	          for(Electronics i:lst){
	        	  System.out.println(i.price+i.brand+i.colour);
	          }
	}

}
