package COM.SAF.I_O.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class filereader {
	
	public static void main(String[] args) {
		
		File f=	new File("C:/Users/SARFARAZ/Desktop/files/abc.txt");
		try {
			FileInputStream fos = new FileInputStream(f);
			ObjectInputStream oop = new ObjectInputStream(fos);
			Object obj = oop.readObject();
			if(obj instanceof dog){
				dog dg=(dog)obj;
				System.out.println(dg.name);
				System.out.println(dg.color);
				System.out.println("le marao rahul modhama");
			
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
