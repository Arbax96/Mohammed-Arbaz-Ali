import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    a=s.nextInt();
    if(a>0)
    {
      System.out.println("the number is positive");
    }
    else
    {
      System.out.println("the number is negtive");
    }

  }
}