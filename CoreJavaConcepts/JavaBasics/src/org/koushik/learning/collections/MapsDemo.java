package org.koushik.learning.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		 
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();

		//Does not maintain the order (random)
		System.out.println("*****HashMap*****");
		testMap(hashMap);
		
		//Maintains insertion order
		System.out.println("*****LinkedHashMap*****");
		testMap(linkedHashMap);

		//Sorts the elements
		System.out.println("*****TreeMap*****");
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer,String> map)
	{
		map.put(4, "dog");
		map.put(22, "pigeon");
		map.put(1, "ant");
		map.put(10, "cat");
		map.put(74, "bat");
		map.put(98, "tiger");
		map.put(2, "lion");

		//Get the elements
		for(Integer key:map.keySet())
		{
			String value = map.get(key);
			System.out.println("Key : "+key+" Value : "+value);
		}
		
		//One more way to got the elements
		/*for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Key : "+key+" Value : "+value);
		}*/
	}
}
