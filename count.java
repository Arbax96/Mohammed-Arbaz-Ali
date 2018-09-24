import java.util.Scanner;
class count {
  public static void main(String[] args) {
    int a,b=0;
    System.out.println();
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    while(a !=0)
    {
      a /=10;
      b++;
    }
     System.out.println(b);
  }
}