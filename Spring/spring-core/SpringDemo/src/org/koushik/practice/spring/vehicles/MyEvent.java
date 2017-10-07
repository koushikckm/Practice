package org.koushik.practice.spring.vehicles;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends  ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return "Event occurred!!!";
	}
}
