package jnext.coll.Vector;

import java.util.Comparator;




public class Baseoncolour implements Comparator<Moblie>  {

		public int compare(Moblie e, Moblie e1) {
	String k=e.colour;
	     
	    
		int  value= k.compareTo(e1.colour);
		return value;
	}

	}


