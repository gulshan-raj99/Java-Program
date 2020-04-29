package fresh;
import java .util.Scanner;
public class Palindrome {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	
	int n=sc.nextInt();
	int temp=n;
	int a;
	int rev=0;
	while(temp>0){
		a=temp%10;
		rev=rev*10+a;
		temp=temp/10;
	}
	if(rev==n)
		System.out.println(" palindrome number");
	else
		System.out.println(" not palidrome number");
}
}
