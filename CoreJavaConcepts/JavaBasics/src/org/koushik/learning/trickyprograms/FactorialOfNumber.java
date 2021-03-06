package org.koushik.learning.trickyprograms;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int n = 6;
		
		//int fact = computeFact(n);
		int fact = recursiveFact(n);
		
		System.out.println("Factorial of "+n+" is : "+fact);
	}
	
	public static int computeFact(int n){
		
		int fact = 1;
		
		if(n==0){
			return 1;
		}
		else{
			for(int i=1;i<=n;i++){
				fact = fact * i;
			}
		}
		return fact;
	}
	
	public static int recursiveFact(int n){
		
		if(n==0){
			return 1;
		}
		else{
			return (n * recursiveFact(n-1));
		}
	}
}
