package org.koushik.learning.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsWithCustomObject {

	public static void main(String[] args) {
		
		Map<Employee,Integer> map = new LinkedHashMap<Employee,Integer>();
		Employee e1 = new Employee(0,"joe");
		Employee e2 = new Employee(1,"sue");
		Employee e3 = new Employee(2,"mac");
		Employee e4 = new Employee(3,"dre");
		Employee e5 = new Employee(4,"kat");
		Employee e6 = new Employee(2,"mac");

		
		map.put(e2, 2);
		map.put(e3, 3);
		map.put(e1, 1);
		map.put(e5, 5);
		map.put(e4, 4);
		map.put(e6, 6);

		for(Employee key : map.keySet())
		{
			System.out.println(key + " : "+ map.get(key));
		}
		
		
		/*Map<Integer,Employee> map1 = new TreeMap<Integer,Employee>();
		Employee e1 = new Employee(0,"joe");
		Employee e2 = new Employee(1,"sue");
		Employee e3 = new Employee(2,"mac");
		Employee e4 = new Employee(3,"dre");
		Employee e5 = new Employee(4,"kat");
		Employee e6 = new Employee(2,"lee");
		
		map1.put(2, e1);
		map1.put(6, e2);
		map1.put(1, e3);
		map1.put(4, e4);
		map1.put(3, e5);
		map1.put(5, e6);

		for(Integer key : map1.keySet())
		{
			System.out.println(key + " : "+ map1.get(key));
		}*/

	}
	
}
