package COM.SAF.I_O.Read_write_characters;

public class noname2 {
		 public static void main(String[] args) {
			 try {
					int n = Integer.parseInt(args[0]);
					if(n < 0)
					{
					throw new NegativeNumberException(n);
					}
					else
					{
					 System.out.println("You have entered positive number...");
					}
					}
					catch (NegativeNumberException e)
					{
					System.out.println("Caught " + e);
					}
					}
}
			

