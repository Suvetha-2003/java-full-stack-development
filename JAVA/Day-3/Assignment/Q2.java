package com.suvetha;

class Vehicle2{
	void drive() {
		System.out.println("Car Repair.");
	}
}

class Car extends Vehicle2{
	void drive() {
		System.out.println("Repairing a car.");
	}
}
public class Q2 {
	public static void main(String args[])
	{
		Vehicle2 v = new Vehicle2();
		v.drive();
		Car c = new Car();
		c.drive();
	}
}
