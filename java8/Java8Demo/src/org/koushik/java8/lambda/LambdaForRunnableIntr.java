package org.koushik.java8.lambda;

public class LambdaForRunnableIntr {

	public static void main(String[] args) throws InterruptedException {
		
		//Using anonymous inner class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<10;i++){
					System.out.println("Hello from thread "+Thread.currentThread().getName());
				}
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();
		t.join();
		
		
		//Using lambda
		Runnable runnableLambda = () -> {
			
			for(int i=0;i<10;i++){
				System.out.println("Hello from lambda thread "+Thread.currentThread().getName());
			}
		};
	
		
		Thread t1 = new Thread(runnableLambda);
		t1.start();
		t1.join();
	}
}
