package jnext.coll.Arraylst.Linklist;

import java.util.Comparator;




public class Baseonbrand implements Comparator<Moblie>  {

		public int compare(Moblie e, Moblie e1) {
	String k=e.brand;
	     
	    
		int  value= k.compareTo(e1.brand);
		return value;
	}

	}



