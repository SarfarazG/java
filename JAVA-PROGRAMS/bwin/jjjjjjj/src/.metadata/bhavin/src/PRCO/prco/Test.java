package PRCO.prco;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Vegmarket Vm=new Vegmarket(); 
        Veg v=Vm.sellveg("Chily");
         if(v instanceof Potato)
         {
        	 Potato p=(Potato)v;
        	 p.makechip();
        	 p.wash();
         }
         else{
        	 Chily c=(Chily)v;
        			 c.bhaji();
        	        c.chop();
         }
	}

}