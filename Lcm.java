package fresh;
//least common multiple
import java.util.Scanner;
public class Lcm {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1st number: ");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number: ");
		int b=sc.nextInt();
		int l;
		for(l=1;l<=a*b;l++) { //l=a>b?a:b;-agar a bda h b se a ke value nhi to b ke value
			if(l%a==0 && l%b==0)
				break;}
			
			System.out.println("lcm of a and b is"+l);
		}
	}


