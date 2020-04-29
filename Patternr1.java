package rishiHomework;
import java.util.Scanner;

public class Patternr1 {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int n=sc.nextInt();
		int temp;
		for(int i=1;i<=n*2-1;i++) {
			if(i<=n)
			{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
			}
			else
			{
				temp=i-n;
				for(int j=1;j<=n-temp;j++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
				
				
			}
			
			
		}
		
				
	}
}
