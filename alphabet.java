package fresh;
import java.util.Scanner;

public class alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		
		if ((ch>='a'&&ch<='z')||(ch>='A'&& ch<='Z'))
			System.out.println("character is alphabet ");
			else {
				System.out.println("charater is not a alphabet");
				
			}
				
			System.out.println();
			
		}
		
		
		
	}


