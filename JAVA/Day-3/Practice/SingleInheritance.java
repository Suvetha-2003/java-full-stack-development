package com.suvetha;

class TwoWheeler {
	void noofWheels() {
		System.out.println("I have Two wheels");
		}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}
	
public class SingleInheritance {
	public static void main(String args[])
	{
		Bike bike = new Bike();
		bike.noofWheels();
		bike.brandName();
	}
}
