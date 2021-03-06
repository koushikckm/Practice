package org.koushik.learning.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

class MyIterable<T> implements Iterable<T> {

	private List<T> list;

	public MyIterable(T[] t) {

		list = Arrays.asList(t);
		Collections.reverse(list);
	}

	@Override
	public Iterator<T> iterator() {

		return list.iterator();
	}
}

public class ItearableExample {

	public static void main(String[] args) {

		Integer[] ints = { 15, 27, 3, 66, 45, 0};

		MyIterable<Integer> myList = new MyIterable<>(ints);

		for (Integer i : myList) {

			System.out.println(i);
		}
	}

}
