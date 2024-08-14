package com.suvetha;


class Animal6{
	void move() {
		System.out.println("Animal moves");
	}
	void makeSounds() {
		System.out.println("Animal makes a sound");
	}
} 

class Bird{
	void move() {
		System.out.println("Birds files");
	}
	void makeSounds() {
		System.out.println("Birds chirps");
	}
}

class Panthera{
	void move() {
		System.out.println("Panthera walks");
	}
	void makeSounds() {
		System.out.println("Panthera roars");
	}
}
public class Main7 {
	public static void main(String args[])
	{
		Animal6 a = new Animal6();
		a.move();
		a.makeSounds();
		Bird b = new Bird();
		b.move();
		b.makeSounds();
		Panthera p = new Panthera();
		p.move();
		p.makeSounds();
	}
}
