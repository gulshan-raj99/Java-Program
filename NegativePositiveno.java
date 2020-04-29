package fresh;
import java.util.Scanner;

public class NegativePositiveno {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("number is positve");
		}
		else 
			System.out.println("number is negative");
		System.out.println();
		
	}
}
