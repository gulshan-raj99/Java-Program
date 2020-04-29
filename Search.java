package array;
import java.util.*;

public class Search {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		int n=sc.nextInt();
		int flag=0;
		int [] a=new int[10];
				for(int i=0;i<n;i++) {
					a[i]=sc.nextInt();
						}
				System.out.println("enter the element who want to search");
				int num=sc.nextInt();
				
				for(int i=0;i<n;i++) { 
					if(a[i]==num) {
						//
						flag=1;
						break;
					}
				}
				if(flag==1) {
					System.out.println("element found");
				}
				else {
					System.out.println("element not found");
				}
				
				
}
}