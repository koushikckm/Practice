package org.koushik.learning.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();

		//Does not guarentee the order and no duplicates
		testSet("HashSet",hashSet);
		//insertion order and no duplicates
		testSet("LinkedHashSet",linkedHashSet);
		//sorted order and no duplicates
		testSet("TreeSet",treeSet);

	}
	
	public static void testSet(String type, Set<String> set)
	{
		set.add("cat");
		set.add("pigeon");
		set.add("ant");
		set.add("tiger");
		set.add("lion");
		set.add("monkey");
		
		//adding duplicates
		set.add("tiger");
		set.add("cat");

		for(String element : set)
		{
			System.out.println(type + " : "+element);
		}
	}
}
