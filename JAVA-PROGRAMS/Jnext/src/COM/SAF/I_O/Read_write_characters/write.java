package COM.SAF.I_O.Read_write_characters;

import java.io.FileOutputStream;

public class write {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/SARFARAZ/Desktop/files/input.txt");
			String s = "hello sarfaraz i am kamlesh";
			byte b[] = s.getBytes();
			fos.write(b);
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}