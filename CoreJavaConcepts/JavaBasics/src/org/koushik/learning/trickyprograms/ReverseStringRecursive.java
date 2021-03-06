package org.koushik.learning.trickyprograms;

public class ReverseStringRecursive {

	
	public String reverseString(String str) 
    {     
		if(str.length() == 0){
			System.out.println("Empty string");
            return "";
        } 
		if(str.length() == 1){
            return str;
        } 
		else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
	
    public static void main(String[] args) 
    {
    	ReverseStringRecursive reverseString = new ReverseStringRecursive();
        String str = "abcde";
        System.out.println("Reverse of "+str+" is "+reverseString.reverseString(str));    
    }    
}
