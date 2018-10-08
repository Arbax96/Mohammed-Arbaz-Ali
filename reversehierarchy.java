import java.util.Scanner;
class reversehierarchy {
  public static void main(String[] args) 
  {
    int a,r=0;
    Scanner c=new Scanner(System.in);
    a=c.nextInt();
    while(a !=0)
    {
      r=r*10 + a % 10;
      a /=10;
      System.out.println(r);
    }
  }
}