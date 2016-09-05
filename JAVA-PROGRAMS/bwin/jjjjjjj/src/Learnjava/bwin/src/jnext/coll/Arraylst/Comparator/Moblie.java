package jnext.coll.Arraylst.Comparator;

public class Moblie implements Comparable <Moblie> {
	String colour;
	int price;
	public Moblie(String s,int i) {
		this.colour=s;
		this.price=i;
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
		

		// TODO Auto-generated method stub
			}

}
