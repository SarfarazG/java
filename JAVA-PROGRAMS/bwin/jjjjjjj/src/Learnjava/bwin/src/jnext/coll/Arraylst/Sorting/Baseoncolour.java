package jnext.coll.Arraylst.Sorting;

import java.util.Comparator;

public class Baseoncolour implements Comparator<Electronic> {
	public int compare(Electronic e, Electronic e1) {
	     String k1=e.Colour;
	     
	    
		 int  value= k1.compareTo(e1.Colour);
		return value;
	}

	}
