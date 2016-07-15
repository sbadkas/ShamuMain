package Files;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("Animals.txt"));
			String Line = bf.readLine();
			System.out.println(Line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
