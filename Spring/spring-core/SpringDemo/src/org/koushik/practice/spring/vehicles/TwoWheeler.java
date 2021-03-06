package org.koushik.practice.spring.vehicles;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component(value="twowheeler")
//@Service(value="twowheeler")
@Controller(value="twowheeler")
public class TwoWheeler implements Vehicle, ApplicationEventPublisherAware{

	Wheel frontWheel;
	Wheel rearWheel;
	
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Wheel getFrontWheel() {
		return frontWheel;
	}

	//@Required
	//@Autowired
	//@Qualifier("twoWheelerRelated")
	@Resource(name="frontWheel")
	public void setFrontWheel(Wheel frontWheel) {
		this.frontWheel = frontWheel;
	}
	public Wheel getRearWheel() {
		return rearWheel;
	}
	//@Required
	//@Autowired
	//@Qualifier("twoWheelerRelated")
	@Resource(name="rearWheel")
	public void setRearWheel(Wheel rearWheel) {
		this.rearWheel = rearWheel;
	}

	@Override
	public void wheelsInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.messageSource.getMessage("frontwheel.info", new Object[] {getFrontWheel().getWidth(), getFrontWheel().getWidth()}, "Default Greeting", null));
		System.out.println(this.messageSource.getMessage("rearwheel.info", new Object[] {getRearWheel().getWidth(), getRearWheel().getWidth()}, "Default Greeting", null));
		
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
	
		MyEvent event = new MyEvent(this);
		publisher.publishEvent(event);
	}

	@PostConstruct
	public void initOfTwoWheeler(){
		System.out.println("init of two wheeler");
	}
	
	@PreDestroy
	public void destroyOfTwoWheeler(){
		System.out.println("destroy of two wheeler");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {

		this.publisher = publisher;
	}
}
