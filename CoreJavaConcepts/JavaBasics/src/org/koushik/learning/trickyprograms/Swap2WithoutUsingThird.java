package org.koushik.learning.trickyprograms;

public class Swap2WithoutUsingThird {

	public static void main(String[] args) {
		
		int a=12;
		int b=15;
		
		System.out.println("Before a="+a+" b="+b);
		swap(a,b);
		
	}
	
	public static void swap(int a,int b){
		a = b-a;
		b = b-a;
		a = a+b;
		System.out.println("After a="+a+" b="+b);
	}
}