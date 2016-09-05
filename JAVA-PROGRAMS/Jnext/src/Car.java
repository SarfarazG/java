
public class Car implements Comparable<Car> {
	
	
	String Brand;
	String clr;
	int Price;
	
	
	
	public Car(String b,String c,int p) {

	this.Brand=b;
	this.clr=c;
	this.Price=p;
	
	}



	@Override
	public int compareTo(Car c1) {
		
		Integer i=this.Price;
		Integer i1=c1.Price;
		int i2=i.compareTo(i1);
		return i2;
	}
	

}
