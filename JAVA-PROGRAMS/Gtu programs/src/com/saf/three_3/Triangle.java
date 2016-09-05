package com.saf.three_3;

public class Triangle extends Shape {
	
	
	
	Triangle(double d1,double d2){
		
		this.d1=d1;
		this.d2=d2;
		
	}

	@Override
	public void area() {
		
		d3=(d1*d2)/2;
		System.out.println("area of triangle i:"+d3);
	}
	
	
	

}
