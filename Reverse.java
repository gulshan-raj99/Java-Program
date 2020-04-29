package fresh;
import java.util.Scanner;

public class Reverse {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	int r;
	int rev=0;
	while(a>0) {
		r=a%10;
		rev=(rev*10)+r;
		a=a/10;
	}
	System.out.println("teh reverse of a number is"+rev);
}
}
