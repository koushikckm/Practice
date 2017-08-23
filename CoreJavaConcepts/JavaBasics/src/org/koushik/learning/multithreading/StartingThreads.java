package org.koushik.learning.multithreading;

public class StartingThreads {

	public static void main(String[] args) {
		
		TestThreadByExtendingThread t1 = new TestThreadByExtendingThread();
		TestThreadByExtendingThread t2 = new TestThreadByExtendingThread();

		t1.start();
		t2.start();
		
		
		/*Thread t1 = new Thread(new TestThreadByImplRunnable());
		Thread t2 = new Thread(new TestThreadByImplRunnable());

		t1.start();
		t2.start();*/
	}
}

//By Extending Thread Class
class TestThreadByExtendingThread extends Thread
{
	@Override
	public void run()
	{
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
}

//By implementing runnable interface
class TestThreadByImplRunnable implements Runnable
{

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
	
}
