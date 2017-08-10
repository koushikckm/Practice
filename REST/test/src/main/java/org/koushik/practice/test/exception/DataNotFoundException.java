package org.koushik.practice.test.exception;

public class DataNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DataNotFoundException(String message){
		super(message);
	}

}
