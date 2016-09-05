package COM.SAF.CF.SET.Hashset.h4;

public class Car {


	String Brand;
	String clr;
	int Price;


	public Car(String b,String c,int p) {

		this.Brand=b;
		this.clr=c;
		this.Price=p;
	}

	@Override
	public int hashCode() {

		return 250;
	}
	// Every details of the newly created object is stored in specific container
	// Because of this the details of each object cant be compared. 
	// To compare it every objects details must be stored in the same container.
	// Hascode Meethod of Object class is used to store detauils in the same container.


	// After storing in same container, every details should be compared, and to compare it "equals" Method of Object class is used.

	@Override
	public boolean equals(Object arg0) {

		if (arg0 instanceof Car) {
			Car c = (Car) arg0;
			
			System.out.println(c.Price+" "+this.Price);  //to check the values.
			
			if (c.Price==this.Price) {

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






