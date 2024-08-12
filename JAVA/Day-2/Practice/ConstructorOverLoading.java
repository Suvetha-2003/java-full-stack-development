package com.suvetha;

public class ConstructorOverLoading {
	ConstructorOverLoading(String name) {
		System.out.println("Welcome "+name);
	}
	ConstructorOverLoading(int a,int b) {
		this("Suvetha");
		System.out.println("Addition : "+(a+b));
	}
	ConstructorOverLoading(int n) {
		this(10,20);
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
	
	public static void main(String args[]) {
		ConstructorOverLoading obj1 = new ConstructorOverLoading(5);
		
}}

