package COM.SAF.Thread.userdefined_thread.by_inheriting_thread_2;

public class main {

	
	public static void main(String[] args) {
		
		new It();
		
		 try  {
			for(int n=0;n<=5;n++){
			System.out.println("Main  Thread: "+n);	
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main interrupted.");
			
		}
		System.out.println("exitiing main");


	}

}
