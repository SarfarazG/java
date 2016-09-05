package jnext.coll.Arraylst.Electronics;
 
public class Electronics implements Comparable<Electronics> {
    int price;
    String brand;
    String colour;
    public Electronics(String brand,int price) {
    	this.price=price;
    	this.brand=brand;
		// TODO Auto-generated craonstructor stub
	}
    public Electronics(String brand,String colour,int price) {
    	this.price=price;
    	this.brand=brand;
		this.colour=colour; 
    	// TODO Auto-generated craonstructor stub
	}
  
	@Override
	public int compareTo(Electronics e) {
		if (this.price==e.price) 
		{
			return 0;
	    }
		else if (this.price < e.price) {
			return 1;
		}
		else
		{
		return -1;	
		}
		}

}
