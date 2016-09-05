package COM.SAF.I_O.Read_write_characters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class readfileusingbr {

	public static void main(String[] args) {

		File fi = new File("C:/Users/SARFARAZ/Desktop/files/input.txt");
		
		try {
			String s;
			String s1="no one can touch me";
			
			FileWriter fw=new FileWriter(fi);
			fw.write(s1);
			fw.close();
			BufferedReader br=new BufferedReader(new FileReader(fi));
			while((s=br.readLine())!=null)
			System.out.println(s);
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
