package org.koushik.practice.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware{

	private Side side1;
	private Side side2;
	private Side side3;
	private Side side4;
	
	private ApplicationContext context = null;
	
	public Side getSide1() {
		return side1;
	}
	public void setSide1(Side side1) {
		this.side1 = side1;
	}
	public Side getSide2() {
		return side2;
	}
	public void setSide2(Side side2) {
		this.side2 = side2;
	}
	public Side getSide3() {
		return side3;
	}
	public void setSide3(Side side3) {
		this.side3 = side3;
	}
	public Side getSide4() {
		return side4;
	}
	public void setSide4(Side side4) {
		this.side4 = side4;
	}
	
	public void printSides(){
		
		System.out.println("Side 1 = "+getSide1().getLength());
		System.out.println("Side 2 = "+getSide2().getLength());
		System.out.println("Side 3 = "+getSide3().getLength());
		System.out.println("Side 4 = "+getSide4().getLength());
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name is "+beanName);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing bean called before init method");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposable bean called before destroying bean");
	}
}