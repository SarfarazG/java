package com.saf.sort.bubble;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int j,swap;
		System.out.println("Enter the number of element u want in array");
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();

		int a[]=new int[q];
		System.out.println("Eneter the elements value:");
		for(int i=0;i<q;i++)
		{
			a[i]=sc.nextInt();

		}
		/*  System.out.println("Eneterd  elements are:");

	  			for(int j:a)
	  				{
						System.out.println(j);
	  				}*/
		for(int i=0;i<q;i++)
		{
			for(j=0;j<q-1;j++)
			{
				if(a[j]>a[j+1])
				{
				
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;				
				}		
		    }
		}


		System.out.println("Sorted array is");{
			for(int i=0;i<q;i++)
			{
				System.out.println(a[i]);

			}
			
			
		}
	}

}

