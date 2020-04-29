import java.util.*;

class ArrayEqual {

    public static boolean arequal(int a[], int b[]) {
        int n=a.length;
    int m=b.length;
if(n!=m)
return false;
Arrays.sort(a);
Arrays.sort(b);
for(int i=0;i<m;i++){
    if(a[i]!=b[i]){
        return false;
    }
}
    return true;

    }
public static void main(String[]args){
    int a [] ={2,4,5,6,7,4};
        int b [] ={2,4,5,7,6,4};
        if(arequal(a,b))
System.out.println(" same ");
else
    System.out.println(" not same");

    //another method
    //Arrays.equals(a,b);

        }

}

    

    
        

