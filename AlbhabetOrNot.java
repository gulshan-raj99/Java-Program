import java.util.*;


class AlbhabetOrNot {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the character : ");
        char ch=sc.next().charAt(0);
        sc.close();

        if((ch>='a'&&ch<='z' )|| (ch>='A'&& ch<='Z'))

System.out.println(" caharacter is Alphabet ");
else
System.out.println(" Character is not Alphabet ");




        
    }
}