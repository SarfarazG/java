package COM.SAF.Thread.userdefined_thread.by_inheriting_thread_2;

public class It extends Thread {

	It(){
		
		super("demo thread");
		System.out.println("Child thread: "+this);
		start();
		
	}
	
	@Override
	 public  void run() {
		
		try {
			for(int n=0;n<=5;n++){
			System.out.println("Child Thread: "+n);	
			Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("exitiing child");
	}
	
}
