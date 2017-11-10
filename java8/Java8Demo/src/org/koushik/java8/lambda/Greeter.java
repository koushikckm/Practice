package org.koushik.java8.lambda;

public class Greeter {

	public void greet(Greeting greeting){
		
		greeting.print();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		
		
		Greeting lamdaGreeting = () -> System.out.println("Greeting message!!");
		greeter.greet(lamdaGreeting);
	}
}
