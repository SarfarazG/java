package com.saf.one_1;

public class Fan {
	
	public static final int SLOW=1;
	public static final int MEDIUM=2;
	public static final int FAST=4;
	int speed;
    boolean f_on;
    double radius;
    String color;
    
    public Fan(){
    	
    	speed=SLOW;
    	f_on=false;
    	radius=4;
    	color="blue";
    	
     }
    
    public Fan(int s,boolean b,double d,String g){
    	
    	speed=s;
    	f_on=b;
    	radius=d;
    	color=g;
    	
    }
    
    public void  display() {

    	if(f_on){
    		System.out.println("=====================================");
    		System.out.println("Speed of Fan is:"+speed);
    		System.out.println("Color of Fan is:"+color);
    		System.out.println("Radius of Fan is:"+radius);  
    		System.out.println("=====================================");
    	}
    	else{
    		
    		System.out.println("=====================================");
    		System.out.println("Fan is off");
    		System.out.println("Color of Fan is:"+color);
    		System.out.println("Radius of Fan is:"+radius);
    		System.out.println("=====================================");

    		
    	}
    		
    	
    	
    	
    	
	}
	

}
