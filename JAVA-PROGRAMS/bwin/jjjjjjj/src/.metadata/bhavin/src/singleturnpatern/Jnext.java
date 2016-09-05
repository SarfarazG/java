package singleturnpatern;

public class Jnext {
	private final static Jnext j=new Jnext();
     private String onlyone;
     
     
     private Jnext(){
    	 setOnlyone("india is beatiful");
     }
 
	

	
	public static Jnext getj() {
		return j;
	}
	public void setOnlyone() {
		System.out.println("onlyone");
	}




	public String getOnlyone() {
		return onlyone;
	}




	public void setOnlyone(String onlyone) {
		this.onlyone = onlyone;
	}

}
