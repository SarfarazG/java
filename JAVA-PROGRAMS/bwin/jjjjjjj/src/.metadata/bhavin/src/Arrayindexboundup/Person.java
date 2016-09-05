package Arrayindexboundup;

import java.util.Scanner;

public class Person {

	/**
	 * @param args
	 */
	public void com() {
		System.out.println("get com");
		Vadafone v=new Vadafone();
		String []cp=v.call();
		Scanner S=new  Scanner(System.in);
		int i=S.nextInt();
	try	{
		String getcp=cp[i];
       System.out.println("you can com "+getcp);				
	}
    catch(Arrayindexboundup e)
    {
	System.out.println("array");
	
    }
 }

}
