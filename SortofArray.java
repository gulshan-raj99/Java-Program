package array;
import java.util.*;

public class SortofArray {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element of array");
	int n=sc.nextInt();
	int []a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	
//	System.out.println("after sorting"+" "+Arrays.toString(a));
	System.out.println(a[0]);
	System.out.println(a[n-1]);
}
}
