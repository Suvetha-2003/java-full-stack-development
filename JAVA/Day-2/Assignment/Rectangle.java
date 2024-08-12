package com.suvetha;

public class Rectangle {
	int width;
	int height;
	Rectangle(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	 void area()
	 {
		 int area=height*width;
		 System.out.println("Area of the Rectagle : "+area);
	 }
	 void Perimeter()
	 {
		 int perimeter=2*(height+width);
		 System.out.println("Perimeter of the Rectangle : "+perimeter);
	 }
	 public static void main(String args[])
	 {
		 Rectangle obj = new Rectangle(20,10);
		 obj.area();
		 obj.Perimeter();
	 }
}
