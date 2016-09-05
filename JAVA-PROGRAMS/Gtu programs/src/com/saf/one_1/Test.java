package com.saf.one_1;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("1st cons called");
		Fan f1=new Fan();
		f1.display();
		System.out.println("2nd cons called");
		Fan f2=new Fan(2,true,6,"brown");
		f2.display();
		
	}

}
