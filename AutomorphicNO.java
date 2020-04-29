package fresh;
import java.util.*;

public class AutomorphicNO {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int a;
	a=n*n;
	while(n<0) {
		break;
	}
	if(a%10==n) {
		System.out.println("Number is Automorphic");
	}else
		System.out.println("Number is not Automorphic");
			
	
}
}
