
public class solution {

	public static void main(String[] args) {

		Adder x=new Adder();

		System.out.println("my super class is:"+x.getClass().getSuperclass().getName());
		System.out.print(x.add(10,32)+" "+x.add(10,3)+" "+x.add(10,10));



	}


}

class Adder extends Arithmetic {

	public int add(int i, int j) {

		return i+j;
	}

}

class Arithmetic{
	
	
}
	








