import java.util.Scanner;
public class MyClass1{
   public static void main(String args[]){
        int eid;
	String ename;
	float esalary;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Employee Id:");
	eid=sc.nextInt();
	System.out.println("Enter Employee Name:");
	ename=sc.next();
	System.out.println("Enter Employee Salary:");
	esalary=sc.nextFloat();

	System.out.println("Enter Employee Id:"+eid);
	System.out.println("Enter Employee Name:"+ename);
	System.out.println("Enter Employee Salary:"+esalary);
   }
}