package COM.SAF.I_O.Read_write_characters;

import java.io.*;

public class Run {


	public static void main(String[] args) {
		File fi = new File("C:/Users/SARFARAZ/Desktop/files/input.txt");
		File fo = new File("C:/Users/SARFARAZ/Desktop/files/output.txt");

		try {
			FileInputStream fin = new FileInputStream(fi);
			FileOutputStream fout = new FileOutputStream(fo);

			int i=0;
			while((i=fin.read())!=-1){
			System.out.println((char)i);
			fout.write(i);
			}
			fin.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



}
}
