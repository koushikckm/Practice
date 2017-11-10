package org.koushik.java8.lambda;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		
		StringLengthLambda myLambda = (s) -> s.length();
		
		System.out.println(myLambda.getLength("Hello lambda"));
	}
}



interface StringLengthLambda{
	int getLength(String s);
}
