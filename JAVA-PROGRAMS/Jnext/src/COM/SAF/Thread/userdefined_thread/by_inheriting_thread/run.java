package COM.SAF.Thread.userdefined_thread.by_inheriting_thread;

public class run {
	
	public static void main(String[] args) {
		
	
		Udthread u1=new Udthread();
		Udthread u2=new Udthread();
		Udthread u3=new Udthread();
		Udthread u4=new Udthread();
		
		u1.setName("1st thread");
		u2.setName("2nd thread");
		u3.setName("3rd thread");
		u4.setName("4th thread");
		
		u1.start();
		u2.start();
		u3.start();
		u4.start();
	
		

		

		
		
		
		
		
		
		
		
	}

}
