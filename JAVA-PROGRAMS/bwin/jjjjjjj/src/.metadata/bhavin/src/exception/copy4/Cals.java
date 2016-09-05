package exception.copy4;


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
		catch(NullPointerException e)
		{
			System.out.println("nullpointer exeception");
		}
		
		catch(Exception e)
		{
			System.out.println("can not div by zero");
		}
	}

	
		
	

}
