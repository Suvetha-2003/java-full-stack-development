import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int r,sum=0,num=0;
        int temp=n;
        while(temp>0)
        {
            temp/=10;
            num++;
        }
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            int power=1;
            for(int i=0;i<num;i++)
            {
                power*=r;
            }
            sum+=power;
            temp=temp/10;
        }
        if(n==sum)
        {
            System.out.println("The given number is Armstrong Number.");
        }
        else
        {
            System.out.println("The given number is not Armstrong Number");
        }
    }
}