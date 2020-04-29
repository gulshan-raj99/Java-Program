package fresh;
import java.util.Scanner;

public class GreaterofTwo {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int large;
		large=a>b?a:b;
		System.out.println("the largest number is " +large);
		System.out.println();
		
	}

}
