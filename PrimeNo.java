package hackerearth;
import java.util.Scanner;


public class PrimeNo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of number");
		int n=sc.nextInt();
		int fact=0;
		int ans;
	for (int i=1;i<=n;i++) {
		fact=0;
		for(int j=2;j<=n/2;j++) {
			ans=n/j;
			if(ans==0) {
				fact++;
				break;
			}
			
		}
		if (fact==2) {
			System.out.println(i);
		}
	}
		}
			
		}
		
	


