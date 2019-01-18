package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) {
		File file = new File("abc.txt");
		try  {
			FileReader reader = new FileReader(file);
			reader.read();
		}catch(IOException | FileNotFoundException e){
			System.out.println("Unable to read file");
		}
		finally {
			System.out.println("In finally");//In finally
			
		}
	}
}
