package org.koushik.learning;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("analysis");
	}

	private static String foo(String w){ 
		if(w==null) 
		return ""; 
		if(w.length() == 1) 
		return w; 
		return w.charAt(w.length()-1)+foo(w.substring(0,w.length()-1)); 
		}
}
