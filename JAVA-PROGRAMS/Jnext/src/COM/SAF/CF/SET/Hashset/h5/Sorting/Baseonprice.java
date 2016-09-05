package COM.SAF.CF.SET.Hashset.h5.Sorting;


	import java.util.Comparator;




import COM.SAF.CF.SET.Hashset.h5.Sorting.Electronic;

public class Baseonprice implements Comparator<Electronic>  {

		public int compare(Electronic e, Electronic e1) {
			
	     Integer k=e.price;
		int  value= k.compareTo(e1.price);
		return value;
	}

	}





