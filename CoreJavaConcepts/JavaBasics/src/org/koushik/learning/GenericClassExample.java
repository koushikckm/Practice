package org.koushik.learning;

public class GenericClassExample<T> {

	// An object of type T is declared
    T obj;
    
    // constructor
    GenericClassExample(T obj) {  
    	this.obj = obj;  
    	}  
    
    public T getObject()  { 
    	return this.obj; 
    	}
    
    public static void main (String[] args)
    {
        // instance of Integer type
		GenericClassExample <Integer> iObj = new GenericClassExample<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        GenericClassExample <String> sObj =
                          new GenericClassExample<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
