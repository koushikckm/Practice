package org.koushik.java8.methodreferences;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		//Using lambda
		//Thread t = new Thread(() -> printMessage());
		
		//Using method references
		Thread t = new Thread(MethodReferenceExample1::printMessage);
		
		t.start();
	}
	
	public static void printMessage(){
		System.out.println("Hello");
	}
}
