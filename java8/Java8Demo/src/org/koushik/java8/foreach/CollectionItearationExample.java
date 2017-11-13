package org.koushik.java8.foreach;

import java.util.Arrays;
import java.util.List;

import org.koushik.java8.lambda.Person;

public class CollectionItearationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("aaa","sss",12),
				new Person("sss","Cat",12),
				new Person("Csd","Cme",12),
				new Person("vrtg","dfg",12),
				new Person("jyt","Cct",12)
				);
	
		System.out.println("Using for loop");
		for(int i=0;i<people.size();i++){
			System.out.println(people.get(i));
		}
	
		System.out.println("Using foreach loop");
		for(Person p : people){
			System.out.println(p);
		}
		
		
		
		//Using java 8 foreach
		System.out.println("Using java 8 foreach");
		people.forEach(p -> System.out.println(p));
	}
	
}
