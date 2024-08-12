package com.suvetha;

public class Circle {
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	void getArea()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of Circle  : "+area);
	}
	
	void getPerimeter() {
		double perimeter=2*3.14*radius;
		System.out.println("Circumference of Circle : "+perimeter);
	}
	
	void setRadius(double radius) {
		this.radius=radius;
	}
	
	public static void main(String args[])
	{
		Circle obj=new Circle(4.5);
		System.out.println("Initial Values : ");
		obj.getArea();
		obj.getPerimeter();
		obj.setRadius(5.5);
		System.out.println("Updated Values : ");
		obj.getArea();
		obj.getPerimeter();
	}
}
