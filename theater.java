import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int a;
   Scanner s=new Scanner(System.in);
   System.out.println("days in theatre");
   a=s.nextInt();
   if(a>50)
   {
     System.out.println("box office hit");
   }
   else
   {
     System.out.println("floap");
   }
  }
}