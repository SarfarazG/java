package com.saf.two_2;

public class Rectangle {

	double x,y;
	int width,height;
	double x1,x2,x3,x4,y1,y2,y3,y4;


	public Rectangle(){

		x=y=0;
		width=height=1;
	}

	public Rectangle(double a,double b,int c,int d){

		x=a;
		y=b;
		width=c;
		height=d;
	}

	double Getarea() {

		double area=height*width;
		return area;

	}

	public double Getperimeter() {

		double perimeter=2*(height+width);
		return perimeter;

	}
	public boolean contains(double tx, double ty) {

		x1=x3=(x-(width/2));
		x2=x4=(x+(width/2));
		y1=y2=(y+(height/2));
		y3=y4=(y-(height/2));

		if((x > x1 && x <4)&&(y < y1 && y< y3));	
		return true;	
	}
}
