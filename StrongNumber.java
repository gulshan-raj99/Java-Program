package fresh;
import java.util.*;
public class StrongNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int n=sc.nextInt();
		int temp=n;
		int a,ans=0;
		while(temp!=0) {
			a=temp%10;
			
			int sum=1;
			for(int i=1;i<=a;i++) {
				sum=sum*i;
				
			}
				
			ans=ans+sum;
			temp=temp/10;
				}
		
		if(ans==n) 
			System.out.println("number is amastrong number");
			else 
				System.out.println("number is not amastrong number");
			}
		}
	


