package COM.SAF.CF._ARRAYLIST.ARRAYLIST4;

import java.util.Comparator;

public class Base_on_clr implements Comparator<Mobile> {


	public int compare(Mobile m, Mobile m1) {

		String i=m.clr;
		String i2=m1.clr;
		int value=i.compareTo(i2);
		return value;

	}
}