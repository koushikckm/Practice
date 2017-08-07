package org.koushik.learning.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class ItearatorExample {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("dog");
		animals.add("cat");
		animals.add("ant");
		animals.add("tiger");
		animals.add("lion");

		Iterator<String> it = animals.iterator();
		while(it.hasNext())
		{
			String value = it.next();
			
			if(value.equals("cat")){
				it.remove();
			}
		}
		
		for(String animal : animals)
		{
			System.out.println(animal);
		}
		
	}
}
