package array;
import java.util.*;
public class SumOfPrefectNumber {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int [] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			
		
		float b=(float)Math.sqrt(a[i]);
		int c=(int)(b);
		if(b-c==0) {
			sum+=a[i];
		}
	}
		System.out.println("sum is"+" "+sum);
	}
	
}
