package COM.SAF.I_O.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serializableclass {

	
	public static void main(String[] args) {
		
		dog d = new dog();
		d.name="why don i say about that but must say that ii am gona say it you";
		d.color="color ios just abut for informnation tha you want ";
		d.b=new belt();
		d.b.bcolor="redfrom me";
		d.b.size=14;
		
	File f=	new File("C:/Users/SARFARAZ/Desktop/files/abc.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oops = new ObjectOutputStream(fos);
			oops.writeObject(d);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
