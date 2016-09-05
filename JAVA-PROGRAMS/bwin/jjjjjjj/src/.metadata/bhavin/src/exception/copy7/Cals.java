package exception.copy7;

public class Cals {

	
	public void div(int i, int j) {
		try
		{
		double d=i/j;
		System.out.println("div=="+d);
		}
		System.out.println("welcome to jnext") 
		catch(Exception e)
		{
			System.out.println("can not div by zero");
		}
		catch(Exception e)
		{
			System.out.println(" exeception");
		}
	}

	
		
	

}
