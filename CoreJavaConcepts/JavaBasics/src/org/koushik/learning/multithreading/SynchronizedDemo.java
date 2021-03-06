package org.koushik.learning.multithreading;

public class SynchronizedDemo {

	private int count = 0;
	
	public static void main(String[] args) {
		
		SynchronizedDemo s = new SynchronizedDemo();
		
		s.doWork();
	}
	
	//synchronized will aquire lock on threads and waits for one thread to finish
	public synchronized void increment()
	{
		count++;
	}
	
	public void doWork()
	{
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					increment();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					increment();
				}
				
			}
			
		});
		
		
		t1.start();
		t2.start();
		
		//wait until threads are finished
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is : "+count);
	}
}
