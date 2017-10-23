package org.koushik.practice.aop.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		this.name = name;
		//throw new Exception();
	}
	

	public String setNameAndReturn(String name){
		return name;
	}
}
