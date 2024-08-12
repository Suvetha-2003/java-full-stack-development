package com.suvetha;

public class Dog {
	String name;
	String breed;
	
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	void getName()
	{
		System.out.println(name);
	}
	void getBreed()
	{
		System.out.println(breed);
	}
	void setName(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	void setBreed(String breed)
	{
		this.breed=breed;
		System.out.println(breed);
	}
	public static void main(String args[])
	{
		Dog d1=new Dog("pinky","Labrador");
		System.out.println("Initial Values : ");
		d1.getName();
		d1.getBreed();
		System.out.println("Updated Values : ");
		d1.setName("Leo");
		d1.setBreed("Bulldog");
		
	}

}
