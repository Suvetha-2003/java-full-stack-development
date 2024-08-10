import java.util.*;
public class RandomNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		int randomNumber = rand.nextInt(100);
		System.out.print("The random number is: "+randomNumber);
	}
}