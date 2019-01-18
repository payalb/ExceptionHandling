package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {
/*		int a= 5/0; //ArithmeticException: DivideBy0Exception {JVM: print the stack trace}
		
		
		int[] arr= new int[5];
		System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		*/
		
		File file= new File("abc.txt");
		FileReader reader=null;
		try {
			 reader= new FileReader(file);
			 System.out.println("File found!!");
			 reader.read();
		} catch (FileNotFoundException e) { //handling exception//sub class exception
			System.out.println("File not found!!");
		}
		catch(IOException e) {
			System.out.println("Error reading a file!");
		}
		System.out.println("Done");
	}
}
