package rishiHomework;
import java.util.Scanner;
public class FactoralOfNumber {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int fact=1;
		
	for(int i=n;i>=1;i--) {
		
		fact=fact*i;
				
	}
	System.out.print(fact);	
	}
}
