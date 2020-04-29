import java.util.*;
 class LengthOfString {
  public static void main(String[]args){
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the String");
      String str=sc.nextLine();
      sc.close();
char ch[]=str.toCharArray();
int i = 0;
for(char iteam:ch){
    i++;
}
System.out.println("The length of string is : " +i);
}
      
  }
