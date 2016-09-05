package COM.SAF.CF.SET.Hashset.h5;


import java.util.Comparator;




import COM.SAF.CF.SET.Hashset.h5.Sorting.Electronic;

public class Baseonprice implements Comparator<Electronics>  {

	@Override
	public int compare(Electronics e, Electronics e1) {

		Integer k=e.price;
		Integer i=e1.price;
		int  value= k.compareTo(i);///or we can write--> e.price.compareTo(e1.price)
		return value;		
	}

}





