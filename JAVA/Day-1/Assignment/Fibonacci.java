import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n3;
        System.out.println("Enter the Range:");
        int c=sc.nextInt();
        System.out.println("Fibonacci Series:");
        System.out.print(n1+" "+n2);
        for(int i=2;i<c;i++)
        {
            n3=n2+n1;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}