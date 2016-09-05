package COM.SAF.jdbc1;

public class extra {
	
	
	public static void main(String[] args) {
		
		double a1 =Math.random();
		System.out.println(a1);
		
		String b= Double.toString(a1);
		
		
		String name="sarfaraz";
		int i=123;
		
		
		String a= Integer.toString(i);
		
		System.out.println(name.charAt(0)+a.substring(0, 1)+b.substring(6, 9));
		
		
		
	}

}
