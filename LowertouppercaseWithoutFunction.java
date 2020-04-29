package rishiHomework;
import java.util.Scanner;

public class LowertouppercaseWithoutFunction {

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a character in lowercase ");
		char ch=sc.next().charAt(0);
ch=(char)(ch-32);

		
		
		
	
		System.out.println("the character in uppercase is = "+ch);
		
		
	}
	
}
