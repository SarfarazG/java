package com.saf.three_3;

public class Circle extends Shape{
	
	double pi=22/7;
	Circle(int radius){
		
		d1=radius;
	}
	

	@Override
	public void area() {

			d2=pi*d1*d1;
			System.out.println("area of circle is :"+d2);
	}

}
