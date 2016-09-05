package exception.copy3;

public class Cals {

	
	public void div(int i, int j) {
		try
		{
		double d=i/j;
		System.out.println("div=="+d);
		}
		catch(Exception e)
		{
			System.out.println("can not div by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("nullpointer exeception");
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exeception");
		}
	}

	
		
	

}
