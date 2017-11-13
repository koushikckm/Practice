package org.koushik.java8.streamapi;

import java.util.Arrays;
import java.util.List;

import org.koushik.java8.lambda.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("aaa","sss",12),
				new Person("sss","Cat",12),
				new Person("Csd","Cme",12),
				new Person("vrtg","dfg",12),
				new Person("jyt","Cct",12)
				);
		
		people.stream()
		.filter(p -> p.getFirstName().length() < 4 )
		.forEach(p -> System.out.println(p.getFirstName()));
		
		
		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.count();
		
		System.out.println(count);
	}
}
