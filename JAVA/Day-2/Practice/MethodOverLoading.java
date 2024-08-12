package com.suvetha;

//Method Overloading
public class MethodOverLoading {
	void myMethod(String name) {
		System.out.println("Welcome "+name);
	}
	void myMethod(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
	void myMethod(int a,int b) {
		System.out.println("Addition : "+(a+b));
	}
	public static void main(String args[]) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.myMethod(5);
		obj.myMethod("Suvetha");
		obj.myMethod(10,20);
	}
}
