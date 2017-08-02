
class Test
{
	//instance variable
	public String name;
	//static variable (class level)
	public static String description;
	//static final variable
	public final static int LUCKY_NUMBER = 10;
	
	public int id;
	public static int count = 0;
	
	Test()
	{
		id = count;
		count++;
	}
	
	public void showName()
	{
		System.out.println(description + " : "+ name);
	}
	
	//static method
	public static void showInfo()
	{
		System.out.println(description);
		//This wont work
		//System.out.println(name);
	}
}


public class StaticFinalExample {

	public static void main(String args[])
	{
		System.out.println("Before creating objects - count is : "+Test.count);
		Test test1 = new Test();
		Test test2 = new Test();
		System.out.println("After creating objects - count is : "+Test.count);

		Test.description = "I am a string";
		System.out.println(Test.description);
		Test.showInfo();
		
		test1.name = "hello1";
		test2.name = "hello2";

		System.out.println(test1.name);
		System.out.println(test2.name);
		test1.showName();
		test2.showName();
		
		System.out.println(Test.LUCKY_NUMBER);
		//Not allowed
		//Test.LUCKY_NUMBER = 11;
	}
}
