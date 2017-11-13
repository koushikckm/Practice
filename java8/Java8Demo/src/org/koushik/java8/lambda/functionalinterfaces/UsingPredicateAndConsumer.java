package org.koushik.java8.lambda.functionalinterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.koushik.java8.lambda.Person;

public class UsingPredicateAndConsumer {

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
		 * Solution using Java 8 lambda
		 */
		
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		
		/*    ****************************************************************************************************************************  */
		
		//Step 2 : Print all people
	
		printAll(people, p -> true);
		
		/*    ****************************************************************************************************************************  */
		
		
		//Step 3 : Print based on specific condition
		
		
		/*
		 * Solution using Java 8 lambda
		 */
		
		System.out.println("Printing all ppl with last name beginning with C");
		
		performConditinally(people, (p) -> p.getLastName().startsWith("C"), (p) -> System.out.println(p));
		
		
		System.out.println("Printing all ppl with first name beginning with C");
		
		performConditinally(people, (p) -> p.getFirstName().startsWith("C"), (p) -> System.out.println(p));
		
		/*    ****************************************************************************************************************************  */
	}
	
	private static void performConditinally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		
		for(Person p : people){
			if(predicate.test(p)){
				consumer.accept(p);
			}
		}
		
	}

	private static void printAll(List<Person> people, Predicate<Person> predicate){
		
		for(Person p : people){
			System.out.println(p);
		}
	}
}
