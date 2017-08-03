package org.koushik.learning.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		testList("ArrayList", arrayList);
		testList("LinkedList", linkedList);
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}
	
	public static void testList(String type, List<Integer> list)
	{
		list.add(22);
		list.add(220);
		list.add(122);
		list.add(197);
		list.add(32);
		list.add(76);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(type+" "+list.get(i));
		}
	}
	
	public static void doTimings(String type, List<Integer> list)
	{
		for(int i=0;i<1E5;i++)
		{
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*Add items at end if list
		 * ArrayList takes less time and is better while adding items at the end of the list
		 */
		/*for(int i=0;i<1E5;i++)
		{
			list.add(i);
		}*/
		
		/*Add items elsewhere the list
		 * Linked list is better while adding items at the beginning or anywhere in middle 
		 */
		for(int i=0;i<1E5;i++)
		{
			list.add(0,i);
		}
				
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken : "+ (end-start) + " ms for "+type);
	}
}
