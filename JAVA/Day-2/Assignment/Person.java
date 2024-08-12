package com.suvetha;

public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void getName() {
		System.out.println("Person Name : "+ name);
	}
	void getAge() {
		System.out.println("Person Age : " +age);
	}
	public static void main(String args[])
	{
		Person obj = new Person("Suvetha",20);
		obj.getName();
		obj.getAge();
	}
	
}
