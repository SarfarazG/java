package COM.SAF.CF.flipkart;

public class Commonclass implements Comparable<Commonclass> {
	
	int price;
	String Brand;
	String clr;

	@Override
	public int compareTo(Commonclass c1) {
		
		Integer i=this.price;
		Integer i1=c1.price;
		int i2=i.compareTo(i1);
		return i2;
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
