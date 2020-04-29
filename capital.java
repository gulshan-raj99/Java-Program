package fresh;
import java.util.Scanner;
public class capital {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the charcater");
		char ch=sc.next().charAt(0);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='U') 
		System.out.println("the entered character is vowel");
		else {
			System.out.println("enterd character is a constant");
			System.out.println();
			
		}
			
			
		}
	}

