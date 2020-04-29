package fresh;
import java.util.Scanner;

public class Hcf {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the first number");
	int a=sc.nextInt();
	System.out.println("emter teh second number");
	int b=sc.nextInt();
	int h;
	for(h=a<b?a:b;h<=1;h--) {
		if(h%a==0 && h%b==0);
	}
	System.out.println("the hcf of two number is" +h);
	
}
}
