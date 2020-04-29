package rishiHomework;
import java.util.Scanner;

public class SumandMeanOfNumber {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int nsum=0,psum=0,pcount=0,ncount=0,pmean=0,nmean=0;
		while(n!=-1) {
			if(n<-1) {
				nsum+=n;
				ncount++;
			}
			else if(n>0) {
				psum+=n;
				pcount++;
				
			}
				n=sc.nextInt();
				
		}
	pmean=psum/pcount;
	nmean=nsum/ncount;
	System.out.println("the positive sum and mean is"+" "+psum+" "+pmean);
	System.out.println("the negative sum and mean is"+" "+nsum+" "+nmean);
		
	}
}
