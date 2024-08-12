package com.suvetha;

public class Variables {
	int b=20; //Instance or Object Variable
	
	static int c=30; //Static or class Variable
	
	public static void main(String args[]) {
		
		int a=10;//Local Variable
		System.out.println("Local Variable : "+a);
		
		Variables obj=new Variables();
		System.out.println(obj.b);
		
		System.out.println(Variables.c);
	}
}
