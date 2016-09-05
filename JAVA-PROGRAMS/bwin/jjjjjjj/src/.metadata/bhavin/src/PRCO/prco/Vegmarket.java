package PRCO.prco;

public class Vegmarket {
Veg v;
public Veg sellveg(String S){
	if(S.equals("potato"))
	{
		v=new Potato();
	}
	else 
	{
		v=new Chily();
	}
	return v;
}

}
