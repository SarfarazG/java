package COM.SAF.Thread.userdefined_thread.implement_2;

public class UDT implements Runnable{
	

	String name;
	Thread t;

	public UDT(String Name) {
		
		name=Name;
		 t =new Thread(this,name);
		System.out.println("new thread: "+t.getName());
		t.start();
	}

	@Override
	public synchronized void run() {

		try {
			for(int n=5; n>0; n--){
			System.out.println(name+": "+n);	
			Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(name+" interrupted.");
		}
		System.out.println(name+" exiting.");

	}

}
