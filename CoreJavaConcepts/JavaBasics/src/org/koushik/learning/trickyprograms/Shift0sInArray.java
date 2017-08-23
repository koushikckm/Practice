package org.koushik.learning.trickyprograms;

public class Shift0sInArray {

	public static void main(String[] args) {
		
		int a[] = {0,0,2,0,4,0,0,5,0,0,1,2};
		System.out.println("Elements of array");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ "\t" );
		}
		
		moveZerosToEnd(a);
		
		System.out.println("\n After moving 0's to end");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
	
	public static void moveZerosToEnd(int a[]){
		
		int count =0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				a[count] = a[i];
				count++;
			}
		}
		while (count < a.length) {
            a[count] = 0;
            count++;
		}
	}
}
