package org.koushik.learning.trickyprograms;

public class MaxDiffofTwoEleInArrayPuzzle {

	//Find max element in array
	//Find min element before the position of max element
	//Difference of max  and min
			
			
	public static void main(String[] args) {
		//int[] a = {3,6,11,-2,14,1,-5};
		//int[] a = {22,6,11,-2,14,1,-5};
		//int[] a = {-22,6,11,-2,14,1,-5};
		//int[] a = {1,6,14,-2,14,1,-5};
		int[] a = {-13,13,22,-2,14,1,26};


		int maxDiff = findMaxDiff(a);
		
		System.out.println("Max diff : "+maxDiff);
	}
	public static int findMaxDiff(int a[]){
		
		//Find max element in array
		int maxVal = findMaxElementInArray(a);
		System.out.println("Max value : "+maxVal);
		
		//Find min element before the position of max element
		int minVal = findMinValueBeforeMaxValue(a,maxVal);
		System.out.println("Min value : "+minVal);
		
		return (maxVal-minVal);
	}
	
	public static int findMaxElementInArray(int arr[]){
		
		int maxVal = arr[0];
		for(int i=1;i<arr.length;i++){
			if(maxVal<arr[i]){
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	
	public static int findMinValueBeforeMaxValue(int a[],int maxVal){
		
		int minVal = a[0];
		if(minVal == maxVal){
			return 0;
		}
		
		for(int i=1;i<a.length;i++){
			
			if(maxVal == a[i]){
				break;
			}
			
			if(minVal>a[i]){
				minVal = a[i];
			}
		}
		return minVal;
	}
}
