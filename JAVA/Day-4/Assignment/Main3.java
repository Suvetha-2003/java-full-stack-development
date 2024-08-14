package com.suvetha;


class Shape1{
	double radius;
	void calculateArea() {
		System.out.println(radius);
	}
}

class Circle2 extends Shape1{
	double radius;
	Circle2(double radius){
		this.radius=radius;
	}
	void calculateArea() {
		System.out.println("Area of the circle : "+(3.14*(radius*radius)));
	}
}

class Rectangle2 extends Shape1{
	int length,bredth;
	Rectangle2(int length,int bredth){
		this.length=length;
		this.bredth=bredth;
	}
	void calculateArea() {
		System.out.println("Area of the Rectangle : "+length*bredth);
	}
}

class Triangle extends Shape1{
	double base,height;
	Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	void calculateArea() {
		System.out.println("Area of Triangle : "+0.5*base*height);
	}
}
public class Main3 {
	public static void main(String args[]) {
		Circle2 c = new Circle2(5);
		c.calculateArea();
		Rectangle2 r = new Rectangle2(4,5);
		r.calculateArea();
		Triangle t = new Triangle(3,4);
		t.calculateArea();
	}
}
