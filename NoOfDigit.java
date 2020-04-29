
class NoOfDigit {

    static int replace(int num){
        if(num==0)
            return 0;
        int digit=num%10;
        if(digit==0)
            digit=1;
return replace(num/10)*10+digit;
    }   
    static int convert(int num){
        if(num==0)
            return 1;
        else
        return replace(num);
    }
public static void main(String[]args){
int num=1020;

System.out.println(replace(num));

}

    }

