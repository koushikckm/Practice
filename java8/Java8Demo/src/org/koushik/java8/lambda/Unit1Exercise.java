package org.koushik.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("aaa","sss",12),
				new Person("sss","Cat",12),
				new Person("Csd","Cme",12),
				new Person("vrtg","dfg",12),
				new Person("jyt","Cct",12)
				);
		
		
		
		//Step 1 : sort list by last name
		
		
		/*
		 * Solution in Java 7 way
		 */
		
		/*Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				return p1.getLastName().compareTo(p2.getLastName());
			}
		});*/
		
		
		/*
		 * Solution using Java 8 lambda
		 */
		
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		
		/*    ****************************************************************************************************************************  */
		
		//Step 2 : Print all people
	
		printAll(people);
		
		/*    ****************************************************************************************************************************  */
		
		
		//Step 3 : Print based on specific condition
		
		/*
		 * Solution in Java 7 way
		 */
		
		/*System.out.println("Printing all ppl with last name beginning with C");
		printConditinally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("C");
			}
		});*/
		
		
		
		/*
		 * Solution using Java 8 lambda
		 */
		
		System.out.println("Printing all ppl with last name beginning with C");
		
		printConditinally(people, (p) -> p.getLastName().startsWith("C"));
		
		
		
		/*System.out.println("Printing all ppl with first name beginning with C");
		printConditinally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				
				return p.getFirstName().startsWith("C");
			}
		});*/
		
		System.out.println("Printing all ppl with first name beginning with C");
		
		printConditinally(people, (p) -> p.getFirstName().startsWith("C"));
		
		/*    ****************************************************************************************************************************  */
	}
	
	private static void printConditinally(List<Person> people, Condition condition) {
		
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people){
		
		for(Person p : people){
			System.out.println(p);
		}
	}
}

interface Condition {
	boolean test(Person p);
}