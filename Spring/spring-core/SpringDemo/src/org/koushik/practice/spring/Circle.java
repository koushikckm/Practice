package org.koushik.practice.spring;

public class Circle implements Shape{

	private int radius;
	private int diameter;
	private int circumference;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public int getCircumference() {
		return circumference;
	}
	public void setCircumference(int circumference) {
		this.circumference = circumference;
	}
	
	public void circleProperties(){
		System.out.println("Radius ="+getRadius());
		System.out.println("Diameter ="+getDiameter());
		System.out.println("Circumference ="+getCircumference());
	}
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle....");
	}
}
