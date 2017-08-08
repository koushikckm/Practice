package org.koushik.learning.multithreading;

public class StartingThreadAsAnonymousInner {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("Starting Thread "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
			
		});
		
		t1.start();
	}
}

