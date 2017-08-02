package org.koushik.learning;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedExceptions {

	public static void main(String args[])
	{
		
		/*Checked Exceptions - You are forced to handle it
			Ex : FileNotFound
		 */
		
		File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			//This will not be executed if an exception is thrown
			System.out.println("Continuing.....");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		/*Runtime Exceptions - Unchecked exceptions - occur at runtime
		 * No need to handle
		 * Basically they are fundamental errors in program
		 * Ex : ArrayIndexOutOfBound
		 * ullPointerException
		 */
		 
		/*int a[] = {1,2,3,4,5};
		System.out.println(a[6]);*/
			
		String text = null;
		System.out.println(text.length());
	}
	}
