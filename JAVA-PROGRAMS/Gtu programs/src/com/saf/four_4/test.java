package com.saf.four_4;

public class test {
	
	public static void main(String[] args) {
		
		Vegitables v1=new Potato();
		System.out.println("Heres the list of vegitables with name and color:");
		System.out.println("color is:"+v1.toString()+" && Name is: "+v1.getClass().getSimpleName());
		Vegitables v2=new Tomato();
		System.out.println("color is:"+v2.toString()+" && Name is: "+v2.getClass().getSimpleName());
		Vegitables v3=new Brinjal();
		System.out.println("color is:"+v3.toString()+" && Name is: "+v3.getClass().getSimpleName());

		
	}

}
