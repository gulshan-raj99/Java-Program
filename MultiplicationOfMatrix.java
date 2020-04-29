package array;
import java.util.Scanner;

public class MultiplicationOfMatrix {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("enter dimension of matrix");
		int rows=sc.nextInt();
		int cols= sc.nextInt();
		
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		
		System.out.println("enter the dimension of first matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
		}
			
		System.out.println("entr the dimension of second matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[rows][cols];
		
		System.out.println("the multiplication of  first and second matrix is");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				c[i][j] =0;
				c[i][j]+=a[i][j]*b[i][j];
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}
}
