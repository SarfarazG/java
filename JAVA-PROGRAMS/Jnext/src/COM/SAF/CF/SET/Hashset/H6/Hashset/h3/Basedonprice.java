package COM.SAF.CF.SET.Hashset.H6.Hashset.h3;

import java.util.Comparator;

public class Basedonprice implements Comparator<Car> {
	
	int price;

	@Override
	public int compare(Car c, Car g) {
		
		Integer i=c.Price;
		Integer i1=g.Price;
		int i2=i.compareTo(i1);
		return i2;
		 
	}
	

}
