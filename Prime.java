import java.util.*;
class Prime {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 1st  number");
    int a=sc.nextInt();
    System.out.println("enter the 2nd number");
    int b=sc.nextInt();
    sc.close();
    
int flag;
for(int j=a;j<=b;j++){
flag=0;
for(int i=2;i<=j/2;i++){
if(j%i==0){
    flag=1;

break;}
}
if(flag==0){
    System.out.print( " "+ j);
}

}

}
}