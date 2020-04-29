import java.util.*;

class BubbleSort
{
    public static void main (String[]args){

Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
System.out.println("enter element of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
            if(a[j+1]<a[j]){
                int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;

                 //swapping
                
            }
        }
      
    }
    System.out.println("after Bubble sort");
    for(int iteam:a){
        System.out.print(iteam+" ");
        //another way to print array
        //for(int i=0;i<n;i++){
           // System.out.println(a[i]+" ");
        }
    }
}

