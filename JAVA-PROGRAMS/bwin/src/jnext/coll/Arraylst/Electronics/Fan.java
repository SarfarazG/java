package jnext.coll.Arraylst.Electronics;

public class Fan extends Electronics {
	String brand;
	int price;
	String colour;
	public Fan(String brand,String colour,int price) {
		super(brand,colour,price);
		this.brand=brand;
     	this.colour=colour;
	    this.price=price;
	
	}

}
