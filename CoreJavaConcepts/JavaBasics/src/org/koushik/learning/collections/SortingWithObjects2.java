package org.koushik.learning.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortingWithObjects2 {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();
		SortedSet<User> set = new TreeSet<User>();
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		System.out.println("******List elements*****");
		showElements(list);
		System.out.println("******Set elements*****");
		showElements(set);
	}
	
	public static void addElements(Collection<User> col)
	{
		col.add(new User("matt"));
		col.add(new User("bran"));
		col.add(new User("stark"));
		col.add(new User("prince"));
		col.add(new User("jamy"));
	}
	
	public static void showElements(Collection<User> col)
	{
		for(User user : col)
		{
			System.out.println(user.getName());
		}
	}
}

class User implements Comparable<User>
{
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	@Override
	public int compareTo(User user) {
		return name.compareTo(user.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}