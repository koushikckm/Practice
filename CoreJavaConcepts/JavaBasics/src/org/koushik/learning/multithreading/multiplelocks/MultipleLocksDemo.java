package org.koushik.learning.multithreading.multiplelocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLocksDemo {

	List<Integer> listOne = new ArrayList<Integer>();
	List<Integer> listTwo = new ArrayList<Integer>();

	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void stageOne() {
		synchronized (lock1) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			listOne.add(random.nextInt(100));
		}
	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			listTwo.add(random.nextInt(100));
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void main() {

		System.out.println("Starting....");

		long start = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}

		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken = " + (end - start));
		System.out.println("List 1 : " + listOne.size());
		System.out.println("List 2 : " + listTwo.size());
	}
}
