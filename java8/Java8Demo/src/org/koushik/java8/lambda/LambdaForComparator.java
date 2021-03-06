package org.koushik.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaForComparator {

	public static void main(String[] args) {
		
		//Using anonymous inner class
		/*Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				return Integer.compare(s1.length(),s2.length());
			}
		};*/
		
		//Using lambda
		Comparator<String> lambdaComp = (String s1, String s2) ->  Integer.compare(s1.length(),s2.length());
		
		List<String> list = Arrays.asList("aaa","aa","aaaa","a");
		Collections.sort(list,lambdaComp);
		
		for(String s : list){
			System.out.println(s);
		}
	}
}
