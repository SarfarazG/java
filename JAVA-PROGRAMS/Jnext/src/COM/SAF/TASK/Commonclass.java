package COM.SAF.TASK;

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
	
	@Override
	public int hashCode() {

		return 250;
	}
	
	
	@Override
	public boolean equals(Object arg0) {

		if (arg0 instanceof Commonclass) {
			Commonclass c = (Commonclass) arg0;
			
			System.out.println(c.price+" "+this.price);  //to check the values.
			
			if (c.price==this.price) {

				return true;
				
			} else {

				return false;

			}
		}
		else {

			return false;

		}
	}

	
	
	
	
	
	
	
	
	

}
