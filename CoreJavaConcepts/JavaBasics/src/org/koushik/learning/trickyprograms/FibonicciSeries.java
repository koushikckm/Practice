package org.koushik.learning.trickyprograms;

import java.util.Scanner;

public class FibonicciSeries {

	public static void main(String[] args) {
		
		//0 1 1 2 3
		System.out.println("Enter the fibonicci series size"); 
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		int fibArr[] = new int[size];
		
		fibArr[0]=0;
		fibArr[1]=1;
		
		for(int i=2;i<size;i++){
			fibArr[i] = fibArr[i-1]+fibArr[i-2];
		}
		
		System.out.println("Fibonicci series is ");
		for(int i=0;i<fibArr.length;i++){
			System.out.print(fibArr[i]+" ");
		}
	}
}
