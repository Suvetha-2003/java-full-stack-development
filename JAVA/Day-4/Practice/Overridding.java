package com.suvetha;

class Animal2{
	void move() {
		System.out.println("All Animals move from one place to another place.");
		}
	void eat() {
		System.out.println("All animals eat something");
	}
}


class Dog2 extends Animal2{
	void move() {
		System.out.println("Dog will move by walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
public class Overridding {
	public static void main(String args[]) {
		Dog2 dog = new Dog2();
		dog.move();
		dog.eat();
	}
}