package org.koushik.learning;

class Robot {
	
	private int id;

	//Inner class
	class Brain
	{
		public void think()
		{
			System.out.println("Robot "+id+" is thinking");
		}
	}
	public Robot(int id) {
		this.id = id;
	}
	
	public void start()
	{
		System.out.println("Starting robot "+id);
		
		Brain brain = new Brain();
		brain.think();
	}
}

public class InnerClassExample {
	
	public static void main(String args[])
	{
		Robot robot = new Robot(5);
		robot.start();
	}
}