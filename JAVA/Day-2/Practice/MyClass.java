package com.suvetha;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName,float employeeSalary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	void display()
	{
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Salary : " + employeeSalary);
	}
}
public class MyClass {
	public static void main(String args[])
	{
		Employee obj1 = new Employee(101,"Thamarai",20000.00f);
		obj1.display();
		Employee obj2 = new Employee(102,"Naveen",10000.00f);
		obj2.display();
	}
}
