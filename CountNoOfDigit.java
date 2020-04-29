package fresh;
import java.util.Scanner;
public class CountNoOfDigit {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
	int a=sc.nextInt();
	int count=0;
	while(a!=0) {
		a=a/10;
		count++;

	}
	System.out.println("the no of integer is"+count);
	}
}