import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the year");
    a=s.nextInt();
    if (a%4==0)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }
  }
}