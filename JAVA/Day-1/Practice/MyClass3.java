import java.util.*;
public class MyClass3{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	int sum=0;
	System.out.println("Enter 5 Integer:");
	for(int i=0;i<arr.length;i++){
	     arr[i]=sc.nextInt();
	}
	
	System.out.println("Array Elements are:");
	for(int i=0;i<arr.length;i++)
	{
	    System.out.println(arr[i]);
	    sum=sum+arr[i];
	}
	System.out.println("Sum of all array elements:"+sum);
  }
}