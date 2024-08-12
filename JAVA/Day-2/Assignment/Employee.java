package com.suvetha;

public class Employee {
	String name;
	String job;
	double Salary;
	
	Employee1(String name,String job,double Salary)
	{
		this.name=name;
		this.job=job;
		this.Salary=Salary;
	}
	
	void Details() {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Job Title : "+job);
		System.out.println("Employee Salary : "+Salary);
	}
	
	void setSalary(double Salary)
	{
		this.Salary=Salary;
	}
	
	public static void main(String args[])
	{
		Employee obj =new Employee("Thamarai","IT",2000.00);
		obj.Details();
		obj.setSalary(5000.00);
		obj.Details();
	}
}
