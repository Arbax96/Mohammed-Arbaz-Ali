import java.util.Scanner;
class Main
 {
  public static void main(String[] args)
   {
    char a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the alphabit");
    a=s.next().charAt(0);
     if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
     {
      System.out.println("alphabet");
     }
     else 
     {
        System.out.println("No");
     }
 }
}