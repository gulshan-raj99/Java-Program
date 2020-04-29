package rishiHomework;
import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[]args) {
		double root1,root2;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double determinant=(b*b)-4*a*c;
		
	if(determinant>0) {
		root1=(-b-Math.sqrt(determinant)) /(2*a);
		root2=(-b+Math.sqrt(determinant)) /(2*a);
		System.out.println("first root = "+root1+"second root =" +" "+root2);
	}
	else if(determinant == 0) {
		root1 = root2 =-b /(2*a);
		System.out.println("first root = "+root1+"second root ="+" "+root2);
	}
	else {
		double realpart =-b /2*a;
		double imaginaryPart=(Math.sqrt(determinant)) /(2*a);
		System.out.println("first root="+realpart+"second roots ="+" "+imaginaryPart);
	}
	
		
	

}
}