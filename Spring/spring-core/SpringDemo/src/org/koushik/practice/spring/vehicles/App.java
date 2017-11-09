package org.koushik.practice.spring.vehicles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-vehicle.xml");
		context.registerShutdownHook();
		Vehicle vehicle = (Vehicle) context.getBean("twowheeler");
		//Vehicle vehicle = (Vehicle) context.getBean("fourwheeler");

		vehicle.wheelsInfo();
		
	}

}