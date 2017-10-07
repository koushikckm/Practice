package org.koushik.practice.spring.vehicles;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListner implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		System.out.println(event.toString());
	}

}
