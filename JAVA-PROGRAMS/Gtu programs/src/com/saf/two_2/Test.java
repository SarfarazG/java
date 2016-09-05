package com.saf.two_2;

public class Test {
	public static void main(String[] args) {
		System.out.println("****************************************************");
		Rectangle r1=new Rectangle();
		System.out.println("Area of rect:"+r1.Getarea()); 
		System.out.println("perimeter of rect:"+r1.Getperimeter());
		System.out.println("contains:"+r1.contains(0, 0)); 
		System.out.println("****************************************************");
		Rectangle r2=new Rectangle(2, 2, 5, 5);
		System.out.println("Area of rect:"+r2.Getarea()); 
		System.out.println("perimeter of rect:"+r2.Getperimeter());
		System.out.println("contains:"+r1.contains(9, 6)); 
		System.out.println("****************************************************");

	}

}
