package com.suvetha;


class Animal1{
	void move() {
		System.out.println("Animal Runs");
	}
}

class Cheetah {
	void move() {
		System.out.println("Cheetah Runs");
	}
}
public class Q6 {
	public static void main(String args[]) {
		Animal1 a = new Animal1();
		a.move();
		Cheetah c = new Cheetah();
		c.move();
	}
}
