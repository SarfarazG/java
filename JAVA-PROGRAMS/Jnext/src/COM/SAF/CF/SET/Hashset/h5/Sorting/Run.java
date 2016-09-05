package COM.SAF.CF.SET.Hashset.h5.Sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Run {
	public static void main(String[] args) {
		ArrayList<Electronic> lst=new ArrayList<Electronic>();
          
            Electronic e15=new Moblie("nokia","bluue", 8896);
            Electronic e16=new Moblie("lava","white",796437);
	        Electronic e17=new Moblie("sony","grey",89899);
	        lst.add(e15);
	        lst.add(e16);
	        lst.add(e17);
			
	      Electronic e1=new Fan("orpet","red",86896);
	      Electronic e2=new Fan("havel","blaCK",7437);
	      Electronic e3=new Fan("luminus","pink",83589);
	      lst.add(e1);
	      lst.add(e2);
	      lst.add(e3);
	      
	      Electronic e4=new Computer("pdpd",21000);
	      Electronic e5 =new Computer("window",20000);
	      Electronic e6=new Computer("sony",14000);
	      Electronic e7=new Computer("intel",16000);
	      lst.add(e4);
	      lst.add(e5);
	      lst.add(e6);
	      lst.add(e7);
	      
	      Electronic e8=new Laptop("lenovo",25000);
	      Electronic e9 =new Laptop("dell",40000);
	      Electronic e10=new Laptop("asus",100000);
	      Electronic e11=new Laptop("hp",60000);
	      lst.add(e8);
	      lst.add(e9);
	      lst.add(e10);
	      lst.add(e11);
	      
	      Electronic e12=new Tv("nokia","red",5000);
	      Electronic e13 =new Tv("lava","blaCK",19000);
	      Electronic e14=new Tv("sony","pink",250000);
	      lst.add(e12);
	      lst.add(e13);
	      lst.add(e14);
	      
	      

           Comparator<Electronic> ct=new Baseonprice();
	      Collections.sort(lst,ct);
	      for(Electronic m111:lst){
	    	 System.out.println(m111.price+"  "+m111.brand+"  "+m111.Colour );}

	      

		  /*    ct=new Baseonbrand();
		      Collections.sort(lst,ct);
		      for(Electronic m111:lst){
		    	 System.out.println("brand name ==="+m111.brand);
		    	 }*/
		      }
	             

		   /*    Comparator<Electronic> ct=new Baseoncolour();
		      Collections.sort(lst,ct);
		      for(Electronic m111:lst){
		    	 System.out.println("colour name ==="+m111.Colour);}*/

	      
	      
	      
	      
	      
	}




