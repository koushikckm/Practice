
class Test1
{
	private int id;
	private String name;
	
	Test1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	//ToString - create string representation of your object
	public String toString()
	{
		return "Id :"+id+" Name : "+name;
	}
}

public class ToStringExample {

	public static void main(String args[])
	{
		Test1 t = new Test1(10,"hello1");
		
		//Without toString() method it would print hashcode 
		System.out.println(t);
	}
	
}
