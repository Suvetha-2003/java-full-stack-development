package com.suvetha;


class Animal4{
	String msg = getMessage();
	String getMessage() {
		return "A";
	}
}

class Dog4 extends Animal4{
	String msg = getMessage();
	String getMessage() {
		return "B";
}
}
public class DMD2 {
public static void main(String args[])
{
	Animal4 animal = new Dog4();
	System.out.println(animal.msg);
}
}
