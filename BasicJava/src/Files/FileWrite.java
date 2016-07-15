package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class FileWrite {

	public static void main(String[] args) {
		File file = new File("Animals.txt");
		try{
		
		if(!file.exists())
			
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			pw.append("adddr");
			//pw.println("cat");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
