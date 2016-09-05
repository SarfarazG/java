package COM.SAF.Thread.t1;

public class run {

	public static void main(String[] args) {


		Thread t=Thread.currentThread();

		System.out.println("current main thread :"+t);

		t.setName("saf thread");
		System.out.println("after setting name:"+t);

		System.out.println("getting id:"+t.getId());
		System.out.println("getting priority:"+t.getPriority());
		System.out.println("checking if alive:"+t.isAlive());


		try {
			t.sleep(1000);
			System.out.println("sleep mode");
			t.sleep(1000);
			for(int n=1;n<=5;n++)
			{
				System.out.println(n);
				t.sleep(1000);
			}
		} catch (InterruptedException e) {

			System.out.println("exception encountered");
		}


	}

}
