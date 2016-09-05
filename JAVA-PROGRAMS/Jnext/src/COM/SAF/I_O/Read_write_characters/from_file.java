package COM.SAF.I_O.Read_write_characters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class from_file {
	public static void main(String[] args) {
		File fi = new File("C:/Users/SARFARAZ/Desktop/files/input.txt");
		FileInputStream fin;
		try {
			fin = new FileInputStream(fi);
			try {
				int l=fin.available();
				System.out.println(l);
				int wordcount=0;
				System.out.println(l);
				
				for(int i=0;i<l;i++){
					
					if((char)fin.read()== ' ' || (char)fin.read()== '\t' || (char)fin.read()== '\n'){
						
						wordcount++;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

}
}