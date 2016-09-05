package COM.SAF.Thread.userdefined_thread.by_inheriting_thread;

public class Udthread extends Thread {
	
	@Override
	public  void run() {
		
		
		Thread t= currentThread();
		System.out.println("thread: "+t.getName()+" "+"Entered");
		System.out.println("thread: "+t.getName()+" "+"Exit");

	}
	
	

}
