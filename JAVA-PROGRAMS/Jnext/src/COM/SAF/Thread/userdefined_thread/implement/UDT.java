package COM.SAF.Thread.userdefined_thread.implement;

public class UDT implements Runnable {public UDT() {
	Thread t =new Thread(this,"demo thread");
	System.out.println("child thread: "+t);
	t.start();
}

@Override
public void run() {

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








