package com.suvetha;


class Vehicle6{
	int speed;
	void speedUp() {
		speed+=10;
	}
	int getspeed() {
		return speed;
	}
}

class Car4 extends Vehicle6{
	void speedUp() {
		super.speedUp();
		System.out.println("Car Speed increased by 24 units");
	}
}

class Bicycle extends Car4{
	void speedUp() {
		super.speedUp();
		System.out.println("Bicycle Speed increased by 12 units");
	}
}
public class Main2 {
	public static void main(String args[])
	{
		Car4 vehicle = new Car4();
		System.out.println("Car initial speed: " + vehicle.getspeed());
		vehicle.speedUp();
		System.out.println("Car Final speed: " + vehicle.getspeed());
		Bicycle v = new Bicycle();
		System.out.println("Bicycle initial speed: " + v.getspeed());
		v.speedUp();
		System.out.println("Bicycle Final speed: " + v.getspeed());
	}
}
