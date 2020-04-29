package array;
import java.util.*;
public class TwoArrayARESameOrNot {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		
		int[]arr1= {2,3,4,5};
		
		int[]arr2= {2,3,5,3};
		boolean equalornot=true;
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					equalornot=false;
				}
				
			}
		}else { 
			equalornot=false;

		}
		if(equalornot) {
			System.out.println("same");
		}
		else
			System.out.println("not same");
	}
}
