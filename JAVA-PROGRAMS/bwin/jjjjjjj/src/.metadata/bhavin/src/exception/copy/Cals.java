package exception.copy;

public class Cals {

	
	public void div(int i, int j) {
		try
		{
		double d=i/j;
		System.out.println("div=="+d);
		}
		catch(NullPointerException e)
		{
			System.out.println("nullpointer exeception");
		}
	}

	
		
	

}
