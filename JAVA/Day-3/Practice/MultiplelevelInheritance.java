package com.suvetha;

class Vehicle{
	void noofEngine(){
		System.out.println("I have one engine");
	}
}

class ThreeWheeler extends Vehicle {
	void noofWheels() {
		System.out.println("I have Three wheels");
		}
}

class Auto extends ThreeWheeler{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}
	
public class MultiplelevelInheritance {
	public static void main(String args[])
	{
		Auto auto = new  Auto();
		auto.noofWheels();
		auto.brandName();
		auto.noofEngine();
	}
}
