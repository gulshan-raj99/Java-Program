package fresh;
import java.util.*;

public class AbudantNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int a,sum=0;
		for(int i=1;i<temp;i++) {
			if(temp%i==0) {
				sum=sum+i;
			}
		}
		if(sum>n)
			System.out.println("Abudant Number");
		else
			System.out.println("Not Abudant Number");
		
		
		
	}

}
