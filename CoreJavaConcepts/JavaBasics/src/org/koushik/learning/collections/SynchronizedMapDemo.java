package org.koushik.learning.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SynchronizedMapDemo {

	/*
	 * 
	 * Each method is synchronized using an object level lock. So the get and put methods on synchMap acquire a lock
	 * (thread-safe) map backed by the specified map.
	 * 
	 * Locking the entire collection is a performance overhead. While one thread holds on to the lock, no other thread can use the collection.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("1", "1");
		hashMap.put("2", "1");
		hashMap.put("3", "1");
		hashMap.put("4", "1");
		hashMap.put("5", "1");
		hashMap.put("6", "1");
		
		System.out.println("Hash map is : "+hashMap);
		
		// create a synchronized map
		Map<String,String> synchronizedMap = Collections.synchronizedMap(hashMap);
		
		System.out.println("Synchronized map is :"+synchronizedMap);
	}
}
