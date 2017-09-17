package org.koushik.learning.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 
 * 	Comparator provides multiple sorting sequence. In other words, we can sort the collection on the basis of multiple elements such as id, name and price etc.
 *
 */
public class SortingListsExample {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("tiger");
		animals.add("lion");
		animals.add("ant");
		animals.add("crocodile");
		animals.add("pigeon");
		animals.add("giraffe");
		
		System.out.println("*****Before Sorting*****");
		for(String animal : animals)
		{
			System.out.println(animal);
		}
		
		//Normal sorting - alphabetical order
		//Collections.sort(animals);
		
		//Sorting based on length of string
		//Collections.sort(animals, new SortByStringLength());
		
		//Sorting in reverse alphabetical
		Collections.sort(animals, new SortByReverseAlphabetical());
		
		System.out.println("*****After Sorting*****");
		for(String animal : animals)
		{
			System.out.println(animal);
		}

	}
}

class SortByStringLength implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2)
		{
			return 1;
		}
		else if(len1 < len2)
		{
			return -1;
		}
		return 0;
	}
}


class SortByReverseAlphabetical implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return -s1.compareTo(s2);
	}
	
}