
class AmstrongNo {
public static void main(String[]args){
    
    int sum=0;
    int c,s;
    for(int i=1;i<=2000;i++){
        s=i;
while(s>0){
    
c=s%10;

sum=sum+(c*c*c);
s=s/10;

}
if(sum==i){
    System.out.print(i + " ");
}
sum=0;
    }
}

}