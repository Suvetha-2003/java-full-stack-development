package com.suvetha;

class Animal{
	void makeSound() {
		System.out.println("Animals makes a sound.");
	}
}

class Cat extends Animal {
	 void makeSound() {
		System.out.println("Cat makes a sound.");
	}
}
public class Main {
	public static void main(String args[]) {
	Animal a = new Animal();
	a.makeSound();
	Cat c = new Cat();
	c.makeSound();
	}
}
