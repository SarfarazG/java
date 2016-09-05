package COM.SAF.I_O.Read_write_characters;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputsreader {

	public static void main(String[] args) {
		
		String text;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		try {
			text=br.readLine();
			System.out.println(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
