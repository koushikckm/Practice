package org.koushik.practice.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(public String org.koushik.practice.aop.model.Circle.getName())")
	public void LoggingAdvice(JoinPoint joinpoint){
		System.out.println("@Before .... Advice run. Get method called");
		System.out.println(joinpoint.toString());
		System.out.println(joinpoint.getTarget());
	}
	
	@Before("args(name)")
	public void stringArgumentMethods(String name){
		
		System.out.println("A method that takes string argument has been called. The value is "+name);
		
	}
	
	@After("execution(public String org.koushik.practice.aop.model.Circle.getName())")
	public void afterMethod(){
		System.out.println("@After .... Advice run. Get method called");
	}
	
	@AfterReturning("args(name)")
	public void afterReturning(String name){
		System.out.println("@AfterReturning");
	}
	
	@AfterThrowing("args(name)")
	public void afterThrowing(String name){
		System.out.println("@AfterThrowing");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
}
