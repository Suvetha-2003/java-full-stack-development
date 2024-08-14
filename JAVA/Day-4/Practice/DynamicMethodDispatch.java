package com.suvetha;


class Animal3{
	void move() {
		System.out.println("All Animals move from one place to another place.");
		}
	void eat() {
		System.out.println("All animals eat something");
	}
}

class Dog3 extends Animal3{
	void move() {
		System.out.println("Dog will move by walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}

class Fish1 extends Dog3{
	void move() {
		System.out.println("Fish move by swim");
	}
	void eat() {
		System.out.println("Fish eat small fish");
	}
}

public class DynamicMethodDispatch {
	public static void main(String args[])
	{
		Animal3 animal;
		animal = new Dog3();
		animal.move();
		animal.eat();
		
	}
}
