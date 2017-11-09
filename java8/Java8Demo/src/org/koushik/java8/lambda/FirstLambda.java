package org.koushik.java8.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {
		
		//Using anonymous inner class
		/*FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		}; */
		
		//Using lambda
		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");
								
		
		File dir = new File("D:/tmp");
		
		File[] files = dir.listFiles(filterLambda);
		
		for(File f : files){
			System.out.println(f);
		}
	}
}
