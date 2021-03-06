package org.koushik.learning;

class Machine
{
	public void start()
	{
		System.out.println("Starting machime.....");
	}
}

interface Plant
{
	public void grow();
}

public class AnonymousClassExample {

	public static void main(String args[])
	{
		Machine m = new Machine(){
			@Override
			public void start()
			{
				System.out.println("Overriding start....");
			}
		};
		m.start();
		
		Plant p = new Plant(){
			@Override
			public void grow()
			{
				System.out.println("Plant growing....");
			}
		};
		p.grow();
	}
}
