package fresh;
import java.util.*;
public class FriendlyPair {
public static void main(String[]args) {

	Scanner sc=new Scanner (System.in);
	System.out.println("enter the 1st number");
	int num1=sc.nextInt();
	
	System.out.println("enter the 2nd number");
	int num2=sc.nextInt();
	
	 
	int sum2=0,sum1=0;
	
	for(int i=1;i<num1;i++) {
		if(num1%i==0) {
			sum1=sum1+i;
		}
	}
	for(int i=1;i<num2;i++) {
		if(num2%i==0) {
			sum2=sum2+i;
		}
	}
	if(sum1==num1  && sum2==num2) 
		System.out.println("Both number is friendly");
		
	else
		System.out.println("Not friendly");
}
}
