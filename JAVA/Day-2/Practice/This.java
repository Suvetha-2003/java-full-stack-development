package com.suvetha;

public class This {
	//this keyword refers current object
	String name;
	
	This(String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	
	This(int a,int b){
		System.out.println("Sum: "+(a+b));
	}
	void greeting() {
		System.out.println("welcome "+name);
	}
	public static void main(String args[]) {
		This obj = new This("Suvetha");
	}
}
