package COM.SAF.CF.SET.Hashset.h5;

import java.util.Comparator;

public class Baseoncolour implements Comparator<Electronics> {
	
	public int compare(Electronics e, Electronics e1) {
		
	     String k1=e.clr;
		 int  value= k1.compareTo(e1.clr);
		return value;
	}

	}
