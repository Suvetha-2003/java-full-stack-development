package com.suvetha;


class Shape{
	void getArea() {
		System.out.println("Area of the shape.");;
	}
}

class Rectangle1{
	int l,b;
	Rectangle1(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void getArea() {
		System.out.println("Area of the Rectangle  : "+(l*b));
	}
}
public class Q3 {
	public static void main(String args[]) {
		Shape s = new Shape();
		s.getArea();
		Rectangle1 r = new Rectangle1(20,10);
		r.getArea();
	}
}
