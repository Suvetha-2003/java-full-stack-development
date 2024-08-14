package com.suvetha;


class Shape2{
	double radius;
	void calculateArea() {
		System.out.println(radius);
	}
}

class Circle3 extends Shape2{
	double radius;
	Circle3(double radius){
		this.radius=radius;
	}
	void getArea() {
		System.out.println("Area of the circle : "+(3.14*(radius*radius)));
	}
	void getPerimeter() {
		System.out.println("Perimeter of the circle : "+2*3.14*radius);
	}
}

class Rectangle3 extends Shape2{
	int length,bredth;
	Rectangle3(int length,int bredth){
		this.length=length;
		this.bredth=bredth;
	}
	void getArea() {
		System.out.println("Area of the Rectangle : "+length*bredth);
	}
	void grtPerimeter() {
		System.out.println("Perimeter of the Rectangle : "+2*(length+bredth));
	}
}

class Triangle1 extends Shape2{
	double base,height;
	int s1,s2,s3;
	Triangle1(double base,double height,int s1,int s2,int s3)
	{
		this.base=base;
		this.height=height;
	}
	void getArea() {
		System.out.println("Area of Triangle : "+0.5*base*height);
	}
	void getPerimeter() {
		System.out.println("Perimeter of the Triangle : "+(s1+s2+s3));
	}
}
public class Main6 {
	public static void main(String args[])
	{
		Circle c = new Circle(5);
		c.getArea();
		c.getPerimeter();
		Rectangle3 r = new Rectangle3(4,5);
		r.getArea();
		r.grtPerimeter();
		Triangle1 t = new Triangle1(20,10,3,5,4);
		t.getArea();
		t.getPerimeter();
	}
}
