import java.util.*;
class PerfectNo {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n=sc.nextInt();
    sc.close();
    int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
    }
    if(sum==n){
        System.out.println("NUmber is perfect ");
    }else{
        System.out.println("Number is not perfect");
    }
}

}