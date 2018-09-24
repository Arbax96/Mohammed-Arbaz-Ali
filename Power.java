import java.util.Scanner;
class Power
{
  public static void main(String[] args) 
  {
      int a,b,r=1;
      Scanner s=new Scanner (System.in);
      a=s.nextInt();
      b=s.nextInt();
     {
         for(int i=1;i<=b;i++)
	      {
            r=r*a;
 	      }	    
     }
    System.out.println(r);
  } 
}