package com.suvetha;

class Vehicle1{
	void noofEngine(){
		System.out.println("I have one engine.");
	}
}

class TwoWheeler1 extends Vehicle1 {
	void noofWheels() {
		System.out.println("I have Two wheels.");
		}
}

class Bike1 extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand Name is Honda.");
	}
}

class Scooty extends TwoWheeler1 {
	void brandName() {
		System.out.println("Brand Name is Activa.");
	}
}


public class HiararicalInheritance {
	public static void main(String args[])
	{
		Bike1 bike1 = new Bike1();
		bike1.noofEngine();
		bike1.noofWheels();
		bike1.brandName();
		
		Scooty scooty = new Scooty();
		scooty.noofWheels();
		scooty.noofEngine();
		scooty.brandName();
		
	}
}
