package fresh;
import java.util.*;
public class PerfectNumber {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int temp=n,ans,sum=0;
	
	for(int i=1;i<n;i++) {
		if(temp%i==0) {
		
		
			sum=sum+i;
		}
			
	
	}
	if(sum==n)
	System.out.println("the number is Perfect Number");
	else
		System.out.println("the number is not perfect number");
}

}