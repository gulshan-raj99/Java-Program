package array;
import java.util.Scanner;

public class ArrayType {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int odd=0,even=0;
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==1) {
				odd++;
			}else
				even++;
		}
		if(n==odd) {
			System.out.println("odd");}
		else if (n==even)
		System.out.println("even");
		
		else 
			System.out.println("mixed");
		
	

}
}