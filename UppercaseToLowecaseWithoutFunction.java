package rishiHomework;
import java.util.Scanner;
public class UppercaseToLowecaseWithoutFunction {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character in upper case");
		char ch =sc.next().charAt(0);
		
		ch=(char) (ch+32);
		System.out.println("the character in lowercase is = "+ch);
	}
	
}

