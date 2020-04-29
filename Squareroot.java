package array;
import java.util.*;
public class Squareroot {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int mid,low=1,high=n;
	while(low<=high) {
	
	mid=(low+high)/2;
	if(mid*mid==n) {
		System.out.println(mid);
		break;
	}
	else if(mid*mid>n) {
		high=mid-1;
	}
	else if(mid*mid<n) {
		low=mid+1;
	}
	
	
}
}
}