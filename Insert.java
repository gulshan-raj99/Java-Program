package array;
import java.util.*;
public class Insert {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int[]a=new int[10];
		System.out.println("enter the element of array");
	
		int n=sc.nextInt();
		int pos,num;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the position where we want to insert");
		pos=sc.nextInt();
		System.out.println ("enter the number who want to insert");
		num=sc.nextInt();
		
		for(int i=n;i>pos;i--) {
			a[i]=a[i-1];
		}
		a[pos]=num;
		n++;
		System.out.println("after insertion of element");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	
		
	}

}