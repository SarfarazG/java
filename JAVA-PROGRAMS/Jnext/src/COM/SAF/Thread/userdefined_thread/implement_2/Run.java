package COM.SAF.Thread.userdefined_thread.implement_2;



public class Run {

	
	public static void main(String[] args) {

		UDT u1=new UDT("one");
		UDT u2=new UDT("two");
		UDT u3=new UDT("Three");
		UDT u4=new UDT("Four");
		
		System.out.println("thread one is alive:"+u1.t.isAlive());
		System.out.println("thread one is alive:"+u2.t.isAlive());
		System.out.println("thread one is alive:"+u3.t.isAlive());
		System.out.println("thread one is alive:"+u4.t.isAlive());
		
		System.out.println("waiting for thread to finish.");
		
		try {
			u1.t.join();
			u2.t.join();
			u3.t.join();
			u4.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread one is alive:"+u1.t.isAlive());
		System.out.println("thread one is alive:"+u2.t.isAlive());
		System.out.println("thread one is alive:"+u3.t.isAlive());
		System.out.println("thread one is alive:"+u4.t.isAlive());


}
}