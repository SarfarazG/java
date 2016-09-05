package COM.SAF.CF._ARRAYLIST.ARRAYLIST4;

import java.util.Comparator;

public class Base_on_name implements Comparator<Mobile> {




	public int compare(Mobile m, Mobile m1) {

		String i=m.name;
		String i2=m1.name;
		int value=i.compareTo(i2);
		return value;

	}
}