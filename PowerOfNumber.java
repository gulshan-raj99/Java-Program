package fresh;
import java.util.*;

public class PowerOfNumber {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int  n=sc.nextInt();
	System.out.println("enter its power");
	int exp=sc.nextInt();
	int a;
	a=(int)Math.pow(n,exp);
	System.out.println("The power of Number is" + a);
}
}
