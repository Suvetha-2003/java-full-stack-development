import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int temp=0,r,sum=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("The given number is Palindrome.");
        }
        else
        {
            System.out.println("The given number is not Palindrome");
        }
    }
}