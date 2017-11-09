package org.koushik.java8.lambda;

public class LambdaForRunnableIntr {

	public static void main(String[] args) throws InterruptedException {
		
		//Using anonymous inner class
		/*Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<10;i++){
					System.out.println("Hello from thread "+Thread.currentThread().getName());
				}
			}
		};*/
		
		//Using lambda
		Runnable runnableLambda = () -> {
			
			for(int i=0;i<10;i++){
				System.out.println("Hello from thread "+Thread.currentThread().getName());
			}
		};
	
		
		Thread t = new Thread(runnableLambda);
		t.start();
		t.join();
	}
}
