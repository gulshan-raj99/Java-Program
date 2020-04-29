package fresh;
import java.util.Scanner;

public class AreaOfCircle {
public static void main (String []args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radious of circle");
	
	double r=sc.nextDouble();
	
	float area= (float)((float)Math.PI*r*r);
	System.out.println("Area of circle is"+ area);
	System.out.println();
	

}
}
