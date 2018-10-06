import java.util.Scanner;
import java.util.io.*;
public class Wordtochar {
    public static void main(String[] args) {
        System.out.println("enter the word");
        Scanner s=new Scanner(System.in);
        String w=s.nextLine();
        System.out.println("enter 1 to print virtical");
        int a=s.nextInt();
         if(a==1)
        {
        for(char b : w.toCharArray())
        {
        System.out.println(b);
        }
        }
       else
         {
          System.out.println(w);
         }
         }
    }
    