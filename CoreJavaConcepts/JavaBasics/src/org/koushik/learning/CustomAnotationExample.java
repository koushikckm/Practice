package org.koushik.learning;

public @interface CustomAnotationExample {

	String name();

	String desc();
}

class MyAnnTest {

	@CustomAnotationExample(name = "test1", desc = "testing annotations")
	public void myTestMethod() {
		// method implementation
	}
	
}
