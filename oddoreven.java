import java.util.Scanner;
class Main
 {
  public static void main(String[] args)
   {
    int a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the value");
    a=s.nextInt();
    if(a%2==0)
    {
      System.out.println("even");
    }
    else if(a%2==1)
    {
    System.out.println("odd");
   }
   else
    {
     System.out.println("invalid");
    }
 }
}