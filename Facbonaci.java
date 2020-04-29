package fresh;
import java.util.Scanner;

public class Facbonaci {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	int c;
	System.out.println("enter the number");
	int n=sc.nextInt();
	System.out.print(a+"  "+ b);
	for(int i=1;i<=n;i++) {
		c=a+b;
		a=b;
		b=c;
	
	
	System.out.print( " "+c+"  "); 
	}


}
}
