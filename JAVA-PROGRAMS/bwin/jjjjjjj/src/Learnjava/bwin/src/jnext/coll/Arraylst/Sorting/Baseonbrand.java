package jnext.coll.Arraylst.Sorting;

import java.util.Comparator;

public class Baseonbrand implements Comparator<Electronic> {
	public int compare(Electronic e, Electronic e1) {
	     String k=e.brand;
	     
	    
		 int  value= k.compareTo(e1.brand);
		return value;
	}

	}
