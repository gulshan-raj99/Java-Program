package array;
import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int arrayA[]=new int[N];
		int arrayB[]=new int[N];
		int arrayc[]=new int[N];
			
		
		for(int i=0;i<N;i++) {			
			arrayA[i]=sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			arrayB[i]=sc.nextInt();
		}
		
			for(int i=0;i<N;i++) {
				arrayc[i]=arrayA[i]+arrayB[i];
			}
			for(int i=0;i<N;i++) {
			System.out.print(arrayc[i]+" ");
			}
			
	
}
	}
