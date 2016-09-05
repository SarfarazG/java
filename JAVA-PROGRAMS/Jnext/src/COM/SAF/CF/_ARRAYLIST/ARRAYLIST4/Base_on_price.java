package COM.SAF.CF._ARRAYLIST.ARRAYLIST4;

import java.util.Comparator;

public class Base_on_price implements Comparator<Mobile> {



	public int compare(Mobile m, Mobile m1) {

		Integer i=m.price;
		Integer i2=m1.price;
		int value=i.compareTo(i2);
		return value;
	}




}
