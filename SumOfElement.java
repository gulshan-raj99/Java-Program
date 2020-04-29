package array;
import java.util.*;
public class SumOfElement {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		int n =sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		System.out.println("tehe sum of element of array is"+" "+sum);
	}
}
