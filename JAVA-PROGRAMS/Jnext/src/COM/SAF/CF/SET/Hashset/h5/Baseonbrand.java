package COM.SAF.CF.SET.Hashset.h5;

import java.util.Comparator;

public class Baseonbrand implements Comparator<Electronics> {
	
	public int compare(Electronics e, Electronics e1) {
		
	     String k=e.brand;
		 int  value= k.compareTo(e1.brand);
		return value;
	}

	}
