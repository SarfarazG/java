package COM.SAF.Input_Output.Clonable;

public class test  implements Cloneable{
	
	int a=10;
	
	public void m1() {
		System.out.println(" nsdhfdvlkdfkvjdfjvfv");
	}
	
	public static void main(String[] args) {
		
		test t =new test();
		t.a=12;
		t.m();
		t.m1();
				
		
	}

	public void m() {
		
		System.out.println("original value:"+a);
		
		try {
			
			test t1=(test)clone();
			System.out.println("copy value:"+t1.a);
			
			t1.a=10;
			System.out.println("changed  value:"+t1.a);

			System.out.println(a);
			
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		
	}
	
	
		
		
		
		
		
		
		
	

}
