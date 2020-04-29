package fresh;
import java.util.Scanner;

public class SumOfNo {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	int r;
	int sum=0;
while(a>=1) {

		r=a%10;
		a=a/10;
		
		sum=sum+r;
	}
System.out.println("the sum of number is"+sum);
}
}
