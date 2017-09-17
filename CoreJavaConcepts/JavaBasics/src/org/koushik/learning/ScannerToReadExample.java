package org.koushik.learning;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerToReadExample {

	public static void main(String args[]) throws FileNotFoundException
	{
		String filename = "/Users/koushiksudheendra/Desktop/Learning/workspace/Practice/CoreJavaConcepts/JavaBasics/file.rtf";
		File file = new File(filename);
		
		Scanner in = new Scanner(file);
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(line);
		}
		in.close();
		
		
		//To accept input from user
		/*Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(line);
		}
		in.close();*/
		
	}
}