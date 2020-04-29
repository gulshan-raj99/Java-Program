package fresh;
import java.util.Scanner;

public class UpperLowerSpecial {
	public static void main (String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the caharacter");
		char ch= sc.next().charAt(0);
		
		if(ch>=65 && ch<=90) {
			System.out.println("charcter is  upper case");
		}
			
			else if(ch>=90 && ch<=122) {
				System.out.println("character is  lower case");
			}
			else if(ch>=48 && ch<=57) {
				System.out.println("character is  number");
			}
			else {
				System.out.println("character is symbol ");
			}
		System.out.println();
		
		
	}

}
