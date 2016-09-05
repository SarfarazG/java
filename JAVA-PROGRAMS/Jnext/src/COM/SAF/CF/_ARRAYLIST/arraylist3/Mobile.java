package COM.SAF.CF._ARRAYLIST.arraylist3;
public class Mobile implements Comparable<Mobile> {

	String name;
	String clr;
	int price;

	Mobile(String n,String c,int p){

		name=n;
		clr=c;
		price = p;

		
	}
	
	
	
	@Override
	/*public int compareTo(Mobile m) {
		
		
		if(this.price==m.price){
			
			
			return 0;
			
		}
		else if(this.price>m.price){
			
			return 1;

		}
		else {
			
			return -1;
		}*/
		
		
	public int compareTo(Mobile m){
		
	String s=this.name;
	String s1=m.name;
	int i=s.compareTo(s1);
	
	return i;

	
		
	}
	}

	
