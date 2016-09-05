package introduction.I3;

import java.util.Scanner;

public class solution {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		
		int l[]=new int[50];
		int m[]=new int[50];
		

		
		l[0]=a+(int)(Math.pow(2, 0))*b;
		m[0]=l[0];
	
	//	System.out.println(l[0]);
		
		
			for(int i=1;i<n;i++){
			
			l[i]=(int)(Math.pow(2, i))*b;
			m[i]=(int)(a+l[i-1]+l[i]);
		}
			
		
		for(int i=0;i<=n;i++){
		
		System.out.println(m[i]);
		}
			
		}
		
	}
