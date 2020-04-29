package rishiHomework;
import java.util.Scanner;

public class FabonaciiSeries {
	public static void main(String[]args) {
		int a=0;
		int b=1;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		System.out.print(a+" "+b);
		
		for(int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c+" ");
		}
		
	}
}