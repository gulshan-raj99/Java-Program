package fresh;
import java.util.Scanner;

public class SumInGivenRange {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int x=sc.nextInt();
		System.out.println("enter the second number");
		int y=sc.nextInt();
		int sum=0;
		for(int i=x;i<=y;i++) {
			sum=sum+i;
		}
System.out.println("the sum of range of 1st and 2nd number is"+sum);
		}

}
