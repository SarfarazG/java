package com.saf.three_3;

public class Rectangle extends Shape{

	Rectangle(double d1,double d2){

		this.d1=d1;
		this.d2=d2;
	}

	@Override
	public void area() {

		d3=(d1*d2);
		System.out.println("area of the rectangle is:"+d3);
	}

}
