package fresh;
import java.util.Scanner;

public class SumOfNaturalNo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println("the sum of a number is" +sum);
	}

}
