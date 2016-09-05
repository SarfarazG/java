package exception.copy2;

public class Cals {

	
	public void div(int i, int j) {
		try
		{
		double d=i/j;
		System.out.println("div=="+d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exeception");
		}
		catch(Exception e)
		{
			System.out.println("can not div by zero");
		}
	}

	
		
	

}
