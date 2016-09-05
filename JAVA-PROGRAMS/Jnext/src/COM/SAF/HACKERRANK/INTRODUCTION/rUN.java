package COM.SAF.HACKERRANK.INTRODUCTION;

import java.util.Scanner;

public class rUN {
	
	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		String a=x.nextLine();
		String b=x.nextLine();
		String c=x.nextLine();
		
		
		
		String s1 []= a.split(" ");
		String s2 []= b.split(" ");
		String s3 []= c.split(" ");
		
		
		
		
		int i=Integer.parseInt(s1[1]);
		int j=Integer.parseInt(s2[1]);
		int k=Integer.parseInt(s3[1]);
		
		
		System.out.printf("%S %03d\n",s1[0],i);
		System.out.printf("%S %03d\n",s2[0],j);
		System.out.printf("%S %03d\n",s3[0],k);


		
	
		
		
	
		

		
		
		

}
}