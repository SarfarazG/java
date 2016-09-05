package jnext.coll.Arraylst.Comparator;

import java.util.Comparator;


public class Baseprice implements Comparator<Moblie>  {

		public int compare(Moblie e, Moblie e1) {
	     Integer k=e.price;
	     
	    
		int  value= k.compareTo(e1.price);
		return value;
	}

	}


