package array;
import java.util.*;


public class Delete {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		int n=sc.nextInt();
	int[]a=new int[10];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int pos;
	
	System.out.println("enter the position do you want to delete");
	pos=sc.nextInt();
	for(int i=pos;i<n-1;i++) {
		a[i]=a[i+1];
	}
	n--;
	System.out.println("array after deletion are:");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	}

}
