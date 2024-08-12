package com.suvetha;
import java.util.*;
class Student{
	int Regno;
	String name;
	int []mark=new int[5];
	
	Student(int Regno,String name)
	{
		this.Regno=Regno;
		this.name=name;
		System.out.println("Student RegNo : "+Regno);
		System.out.println("Student Name : "+name);
	}
	void getMarks() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			mark[i]=sc.nextInt();
		}
	}
	void displayGrade() {
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=mark[i];
		}
		System.out.println("Total : "+sum);
		int Avarage =sum/5;
		System.out.println("Average Marks : "+Avarage);
		if(Avarage>=90)
		{
			System.out.println("Grade A");
		}
		else if(Avarage>=80 && Avarage<90)
		{
			System.out.println("Grade B");
		}
		else if(Avarage>=70 && Avarage<80)
		{
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}
}
public class Assignment {
	public static void main(String args[]) {
		Student obj=new Student(101,"Suvetha");
		obj.getMarks();
		obj.displayGrade();
	}
}
