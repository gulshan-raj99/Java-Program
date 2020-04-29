package fresh;
import java.util.Scanner;
public class GreaterOfThree {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the 1st number");
			int a=sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println("enter the 3rd number");
			int c=sc.nextInt();
			int large;
			if(a>b && a>c) {
				System.out.println("the largest number is"+a);
			}
			else {
				large=b>c?b:c;
				System.out.println("the largest number is" +large);
			}
			System.out.println();
		}
	}


