package org.koushik.learning.multithreading;

public class StartingThreads {

	public static void main(String[] args) {
		
		/*Test t1 = new Test();
		Test t2 = new Test();

		t1.start();
		t2.start();*/
		
		
		Thread t1 = new Thread(new Test());
		Thread t2 = new Thread(new Test());

		t1.start();
		t2.start();
	}
}

//By Extending Thread Class
/*class Test extends Thread
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
}*/

//By implementing runnable interface
class Test implements Runnable
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
