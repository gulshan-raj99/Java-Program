package array;
import java.util.*;

public class BinarySearch {
	public static void main(String[]args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the Size of array");
int n=sc.nextInt();

int[] a=new int[n];

System.out.println("enter the element of array");
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}
System.out.println("enter the element whose want to search");
int key=sc.nextInt();
int low=0;int high=n-1;int mid;


while(low<=high) {
	mid=low+(high-1)/2;


if(a[mid]==key) {
	System.out.println("element found in array");
	break;
}
else if(a[mid]>key) {
	high=mid-1;
}
else if(a[mid]<key){
	low=mid+1;	
}
}
if(low>high)
	System.out.println("element not present in array");

}
}	
