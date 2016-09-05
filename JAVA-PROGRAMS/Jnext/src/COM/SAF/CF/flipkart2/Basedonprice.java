package COM.SAF.CF.flipkart2;

import java.util.Comparator;

public class Basedonprice implements Comparator<Commonclass>{
	
	int price;
	String Brand;
	String clr;

	
	@Override
	public int compare(Commonclass c, Commonclass c1) {
		Integer i=c.price;
		Integer i1=c1.price;
		int i2=i.compareTo(i1);
		return i2;
	}
	
	
	
	
	
	

}
