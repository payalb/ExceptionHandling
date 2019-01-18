package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//File is not there?  CheckedException: compile error
public class Demo4 {
	public static void main(String[] args) throws IOException{
		File file = new File("abc.txt");
		try  {
			FileReader reader = new FileReader(file);
			reader.read();
		}finally {
			System.out.println("In finally");//In finally
			
		}
		System.out.println("doing work a");
	}
}