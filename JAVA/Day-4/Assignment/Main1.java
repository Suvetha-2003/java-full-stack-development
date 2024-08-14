package com.suvetha;


class Animal5{
	void Sound() {
		System.out.println("Animals make sounds.");
	}
}

class Bird1 extends Animal5{
	void Sound() {
		System.out.println("Birds make chirps.");
		}
}

class Cat2{
	void Sound() {
		System.out.println("Cat Say Meow.");
	}
}
public class Main1 {
	public static void main(String args[])
	{
		Animal5 animal = new Animal5();
		animal.Sound();
		Bird1 bird = new Bird1();
		bird.Sound();
		Cat2 cat = new Cat2();
		cat.Sound();
	}
}
