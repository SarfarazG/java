package jnext.coll.Arraylst.Sorting;


	import java.util.Comparator;




import jnext.coll.Arraylst.Sorting.Electronic;

public class Baseonprice implements Comparator<Electronic>  {

		public int compare(Electronic e, Electronic e1) {
	     Integer k=e.price;
	     
	    
		int  value= k.compareTo(e1.price);
		return value;
	}

	}





