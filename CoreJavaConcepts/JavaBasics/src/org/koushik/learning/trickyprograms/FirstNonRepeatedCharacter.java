package org.koushik.learning.trickyprograms;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * copy string to string array
 * loop thro the array twicw
 */


public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String s = "aabbccf";
		String[] str = new String[s.length()];
		
		//copy string to string array
		for(int i=0;i<s.length();i++){
			str[i]=s.substring(i,i+1);
		}
		
		System.out.println("String is : "+s);
	
		String repeated = "";
		
		for(int i=0;i<str.length;i++){
			String currChar = str[i];
			boolean flag = false;
			
			
			for(int j=i+1;j<str.length;j++){
				//If it encounters end of array
				if(j==str.length){
					
				}
				
				if(currChar.equals(repeated)){
					flag = true;
					break;
				}
			
				if(currChar.equals(str[j])){
					repeated = str[j];
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println("First non repeating char is : "+currChar);
				break;
			}
		}
	}
}
