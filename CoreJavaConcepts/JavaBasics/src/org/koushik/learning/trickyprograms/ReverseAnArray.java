package org.koushik.learning.trickyprograms;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int a[] = {0,8,44,6,34,0,0,72};
		System.out.println("Initial array is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		reverseArray(a);
	}
	
	public static void reverseArray(int a[]){
		
		//Loop and compare first-last and reverse ....second-second last reverse
		int start = 0;
		int end = a.length;
		int loop = (end-start)/2;
		int temp;
		
		for(int i=0;i<+loop;i++){
			temp = a[start];
			a[start] = a[end-1];
			a[end-1] = temp;
			start++;
			end--;
		}
		System.out.println("Reversed array is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
