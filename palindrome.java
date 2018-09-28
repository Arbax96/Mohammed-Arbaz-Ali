import java.util.Scanner;
class Main {

    public static void main(String[] args) {
           int a;
           Scanner s=new Scanner(System.in);
           a=s.nextInt();
        int n= a, r = 0;

        while(n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n /= 10;
        }
       if(a==r)
       {
       System.out.println("yes");
       }
       else
       {
         System.out.println("no");
       }
      }
    }