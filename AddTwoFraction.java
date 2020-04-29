package fresh;
import java.util.*;


public class AddTwoFraction {
	static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	public static void main(String[]args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st numerator");
		int num1=sc.nextInt();
		System.out.println("enter the 1st denomenator");
		int deno1=sc.nextInt();
		System.out.println("enter the 2nd numenator");
		int num2=sc.nextInt();
		System.out.println("enter the 2nd denomenator");
		int deno2=sc.nextInt();
		int i;
	/*	for( i=1;i<=deno1*deno2;i++) {
			if(i%deno1==0&&i%deno2==0) 
				break;}
		
			
		float sum1=0;
		sum1=	(i/deno1)+num1;
		float sum2=0;
		sum2=(i/deno2)+num2;
		float r1=0;
		r1=sum1+sum2;
		float result=0;
		result=r1/i;
		System.out.println("the sum of its number is"+result);*/
		
		/*int dmul=deno1*deno2;
		int Snum=(num1*deno2)+(num2*deno1);
		float result=(float)Snum/dmul;
		System.out.println(result);*/
		/*float res=(float)num1/deno1+(float)num2/deno2;
		System.out.println(res);*/
		//AddTwoFraction a=new AddTwoFraction();
		
		
		int dmul=deno1*deno2;
		int Snum=(num1*deno2)+(num2*deno1);
		int hcf=gcd(dmul,Snum);
		//int hcf=a.hcf(dmul,Snum);
		System.out.print(Snum/hcf+"/");
		System.out.println(dmul/hcf);
		
		}
	}


