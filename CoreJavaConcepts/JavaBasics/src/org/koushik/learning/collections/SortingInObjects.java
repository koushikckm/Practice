package org.koushik.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingInObjects {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		Person p1 = new Person(22,"mac");
		Person p2 = new Person(9,"matt");
		Person p3 = new Person(17,"sue");
		Person p4 = new Person(47,"joe");
		Person p5 = new Person(29,"jack");
		Person p6 = new Person(98,"john");

		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
		System.out.println("*****Before sorting*****");
		for(int i=0;i<people.size();i++)
		{
			System.out.println("Id : "+people.get(i).getId() +" Name : "+people.get(i).getName());
		}

		//Can use anonymous inner class for comparator
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId() > p2.getId())
				{
					return 1;
				}
				else if(p1.getId() < p2.getId())
				{
					return -1;
				}
				return 0;
			}
			
		});
		
		System.out.println("*****After sorting wrt id*****");
		for(int i=0;i<people.size();i++)
		{
			System.out.println("Id : "+people.get(i).getId() +" Name : "+people.get(i).getName());
		}
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		System.out.println("*****After sorting wrt name*****");
		for(int i=0;i<people.size();i++)
		{
			System.out.println("Id : "+people.get(i).getId() +" Name : "+people.get(i).getName());
		}
	}
	
}