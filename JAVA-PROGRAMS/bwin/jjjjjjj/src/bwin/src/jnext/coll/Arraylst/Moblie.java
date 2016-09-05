package jnext.coll.Arraylst;

public class Moblie implements Comparable <Moblie>{
 
	String colour;
	public String brand;
	 public int price;
	
    	public Moblie(String s, int price) {
	
		this.colour=s;
	
		this.price=price;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Moblie m) {
		if (m.price==this.price) {
			
		
		return 0;
		}else if (m.price<this.price) {
           return 1;			
		}
		else
		{
          return -1;
		}
		}

}
