package org.koushik.learning;

class Person
{
	private int id;
	private String name;
	
	Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "ID : "+id+" Name : "+name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

public class EqualsMethodExample {

	public static void main(String args[])
	{
		Person p1 = new Person(1,"hello1");
		Person p2 = new Person(2,"hello2");
		Person p3 = new Person(1,"hello3");
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
