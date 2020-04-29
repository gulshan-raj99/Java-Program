package fresh;
import java.util.*;

public class Amastrong {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n,c=0,result=0,a;
		while(temp!=0) {
			temp=temp/10;
			c++;
		}
		temp=n;
		while(temp!=0) {
			a=temp%10;
			result+=Math.pow(a,c);
			temp=temp/10;
			
		}
		if(result==n) 
			System.out.println("number is Amstrong");
		else
			System.out.println("number is not Amstrong");
	}

}
