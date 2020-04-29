package fresh;
import java.util.*;

public class HarshadNo {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int temp=n;
	int a,sum=0;
	while(temp!=0) {
		a=temp%10;
		sum=sum+a;
		temp=temp/10;
	}
	if(n%sum==0) {
		System.out.println("Harshad number");
	}else
		System.out.println("Not Harshad Number");
	
}
}
