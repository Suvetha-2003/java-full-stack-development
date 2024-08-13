package com.suvetha;


class A1{
	A1(){
		System.out.println("A");
	}
	A1(int a) {
		System.out.println("A 1");
	}
}

class B1 extends A1{
	B1(){
		super(5);
		System.out.println("B");
	}
	B1(int a) {
		System.out.println("B 1");
	}
}
public class ConstructorInvocation1 {
	public static void main(String args[])
	{
		B1 b =new B1(5);
	}
}
