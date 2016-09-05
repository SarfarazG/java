package COM.SAF.CF.SET.Hashset.h5.Sorting;

public class Electronic{

	String name;
	String Colour;
	String brand;
    public int price;
	String location;

	
	public Electronic(String brand,String colour,int price) {
		
		this.brand=brand;
		this.Colour=colour;
		this.price=price;
	}
	public Electronic(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	public Electronic(String brand,int price,String location) {
		this.brand=brand;
		this.location=location;
		this.price=price;

	
	
	}
}