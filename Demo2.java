package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args)  {

		File file = new File("abc.txt");
		try (FileReader reader = new FileReader(file);) {
			int i = reader.read();
			while (i != -1) {
				System.out.println((char) i);
				i = reader.read();
			}
			
		}catch(Exception e) {
			System.out.println("Could not read file!");
		}
	/*	try {
		int x= 5/0;
		System.out.println(x);
		}catch(ArithmeticException e) {
			
		}*/
	}
}
//AutoCloseable