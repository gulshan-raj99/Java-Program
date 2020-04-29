package array;
import java.util.Scanner;

public class RangeofArray {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
		int L= sc.nextInt();
		
		System.out.println("enter the last number");
		int R= sc.nextInt();
		
		for(int i=L;i<R;i++) {
			System.out.println(i);
		}
		
	}

}
