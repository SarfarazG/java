package COM.SAF.I_O.Read_write_characters;

import java.io.*;

public class wordchanfe {
	
	public static void main(String[] args) {
		
		
		File f = new File("C:/Users/SARFARAZ/Desktop/files/abc.txt");
		File fo = new File("C:/Users/SARFARAZ/Desktop/files/input.txt");

		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line ="",oldtext="";
			try {
				while((line=br.readLine())!=null){
		
				oldtext+=line+"\n";
				}

				System.out.println(oldtext);
				
				br.close();
				String newtext = oldtext.replace("word1", "word2"); 
				System.out.println(newtext);
				FileWriter fw = new FileWriter(f);
				fw.write(newtext);
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
