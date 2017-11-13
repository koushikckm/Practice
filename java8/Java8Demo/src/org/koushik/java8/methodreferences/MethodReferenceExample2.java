package org.koushik.java8.methodreferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.koushik.java8.lambda.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("aaa","sss",12),
				new Person("sss","Cat",12),
				new Person("Csd","Cme",12),
				new Person("vrtg","dfg",12),
				new Person("jyt","Cct",12)
				);
		

		//Using lambda
		//performConditinally(people, (p) -> true, (p) -> System.out.println(p));
		
		//Using method reference
		performConditinally(people, (p) -> true, System.out::println);
		
		
	}
	
	private static void performConditinally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		
		for(Person p : people){
			if(predicate.test(p)){
				consumer.accept(p);
			}
		}
		
	}

}
