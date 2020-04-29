package fresh;
import java.util.Scanner;

public class Ascii {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		int ascii=(int)ch; //typecasting char into int datatype
		System.out.println("ASCII of "+ch+" is " +ascii);
		
		
		System.out.println();
		
		
	}

}
