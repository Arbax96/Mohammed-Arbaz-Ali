import java.util.Scanner;
class Main {
  public static void main(String[] args)
   {
     int b=0,a,i;
     Scanner s=new Scanner(System.in);
     System.out.println("enter N");
     a=s.nextInt();
     for(i=0;i<=a;i++)
     {
        b=b+i;
     }
       System.out.println(b);
  }
}