package org.koushik.learning.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		/*There is no locking at the object level,The locking is at a much finer granularity. 
		For a ConcurrentHashMap, the locks may be at a hashmap bucket level
		
		The effect of lower level locking is that you can have concurrent readers and writers which 
		is not possible for synchronized collections. This leads to much more scalability
		
		ConcurrentHashMap does not throw a ConcurrentModificationException if one thread tries to modify it 
		while another is iterating over it*/
		
		
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
		concurrentHashMap.put("1", "1");
		concurrentHashMap.put("2", "1");
		concurrentHashMap.put("3", "1");
		concurrentHashMap.put("4", "1");
		concurrentHashMap.put("5", "1");
		concurrentHashMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: " + concurrentHashMap);
		Iterator<String> it = concurrentHashMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			if (key.equals("3"))
				concurrentHashMap.put(key + "new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: " + concurrentHashMap);

		// HashMap
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("1", "1");
		hashMap.put("2", "1");
		hashMap.put("3", "1");
		hashMap.put("4", "1");
		hashMap.put("5", "1");
		hashMap.put("6", "1");
		System.out.println("HashMap before iterator: " + hashMap);
		Iterator<String> it1 = hashMap.keySet().iterator();

		while (it1.hasNext()) {
			String key = it1.next();
			if (key.equals("3"))
				hashMap.put(key + "new", "new3");
		}
		System.out.println("HashMap after iterator: " + hashMap);
	}
}
